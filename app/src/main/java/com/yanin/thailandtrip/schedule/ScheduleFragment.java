package com.yanin.thailandtrip.schedule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yanin.thailandtrip.BaseFragment;
import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.WeekViewEventConverter;
import com.yanin.thailandtrip.db.Schedule;

public class ScheduleFragment extends BaseFragment implements ScheduleContract.View{

    private final static String ARG_SCHEDULE_ID = "scheduleId";
    private long scheduleId;

    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;
    private TextView txtTransport;
    private TextView txtMoney;
    private TextView txtLocation;
    private TextView txtNote;
    private ImageView imageSchedule;
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
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsingToolbarLayout);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        txtTransport = (TextView)findViewById(R.id.txtTransport);
        txtMoney = (TextView)findViewById(R.id.txtMoney);
        txtLocation = (TextView)findViewById(R.id.txtLocation);
        txtNote = (TextView)findViewById(R.id.txtNote);
        imageSchedule = (ImageView)findViewById(R.id.imageSchedule);
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
        WeekViewEventConverter converter = new WeekViewEventConverter(getContext());
        collapsingToolbarLayout.setTitle(schedule.getTitle());
        collapsingToolbarLayout.setContentScrimColor(converter.getColorByScheduleType(schedule.getType()));
        collapsingToolbarLayout.setStatusBarScrimColor(converter.getColorByScheduleType(schedule.getType()));
        toolbar.setTitle(schedule.getTitle());
        txtTransport.setText(schedule.getTransport());
        txtMoney.setText(String.valueOf(schedule.getMoney()));
        txtLocation.setText(schedule.getLocation());
        txtNote.setText(schedule.getNote());
        Glide.with(this)
                .load(schedule.getImageUrl())
                .into(imageSchedule);
    }
}
