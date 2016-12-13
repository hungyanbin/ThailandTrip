package com.yanin.thailandtrip;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;
import com.yanin.thailandtrip.framework.BaseFragment;
import com.yanin.thailandtrip.framework.MainActivity;
import com.yanin.thailandtrip.page.PageFactory;
import com.yanin.thailandtrip.schedule.ScheduleRepo;
import com.yanin.thailandtrip.schedule.ScheduleUtil;

import java.util.Collections;
import java.util.List;

import io.reactivex.Observable;

public class CalendarFragment extends BaseFragment {

    private WeekView weekView;
    private List<WeekViewEvent> weekViewEvents;
    private static final String TAG = "CalendarFragment";
    private static final int TRIP_YEAR = 2016;
    private static final int TRIP_MONTH = 12;

    public static CalendarFragment newInstance() {

        Bundle args = new Bundle();

        CalendarFragment fragment = new CalendarFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = ((MainActivity) getActivity()).getToolbar();
        setupMainToolbar(toolbar, R.string.calendar);

        setWeekView(view);
    }

    private void setWeekView(View view) {
        weekView = (WeekView) view.findViewById(R.id.weekView);

        weekView.setOnEventClickListener((event, eventRect) -> {
            pageNavigator.openPage(new PageFactory.SchedulePage(event.getId()));
        });
        weekView.setMonthChangeListener((newYear, newMonth) -> {
            if(weekViewEvents == null){
                loadSchedules();
            }

            if(newYear == TRIP_YEAR && newMonth == TRIP_MONTH) {
                return weekViewEvents;
            }else{
                return Collections.emptyList();
            }
        });
    }

    private void loadSchedules(){
        ScheduleRepo scheduleRepo = RepoFactory.getScheduleRepo();
        ScheduleUtil converter = new ScheduleUtil(getContext());
        scheduleRepo.loadAll()
                .toObservable()
                .flatMap(Observable::fromIterable)
                .map(converter::convert)
                .toList()
                .subscribe(events -> weekViewEvents = events, throwable -> Log.e(TAG, "", throwable));
    }
}
