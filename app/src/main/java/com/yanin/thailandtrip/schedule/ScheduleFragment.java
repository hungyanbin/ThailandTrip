package com.yanin.thailandtrip.schedule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yanin.thailandtrip.BaseFragment;
import com.yanin.thailandtrip.R;

public class ScheduleFragment extends BaseFragment implements ScheduleContract.View{

    private final static String ARG_SCHEDULE_ID = "scheduleId";
    private long scheduleId;

    private Toolbar toolbar;
    private TextView txtTransport;
    private TextView txtMoney;
    private TextView txtLocation;
    private TextView txtNote;
    private ScheduleContract.Presenter presenter;

    public static ScheduleFragment newInstance(long scheduleId) {

        Bundle args = new Bundle();
        args.putLong(ARG_SCHEDULE_ID, scheduleId);

        ScheduleFragment fragment = new ScheduleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        scheduleId = bundle.getLong(ARG_SCHEDULE_ID);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        findView();
        setupToolbar(toolbar);
        presenter = new SchedulePresenter(this);
    }

    private void findView() {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        txtTransport = (TextView)findViewById(R.id.txtTransport);
        txtMoney = (TextView)findViewById(R.id.txtMoney);
        txtLocation = (TextView)findViewById(R.id.txtLocation);
        txtNote = (TextView)findViewById(R.id.txtNote);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                pageNavigator.toLastPage();
                return true;
        }
        return false;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.onStart(scheduleId);
    }

    @Override
    public void show(Schedule schedule) {
        toolbar.setTitle(schedule.getTitle());
        txtTransport.setText(schedule.getTransport());
        txtMoney.setText(String.valueOf(schedule.getMoney()));
        txtLocation.setText(schedule.getLocation());
        txtNote.setText(schedule.getNote());
    }
}
