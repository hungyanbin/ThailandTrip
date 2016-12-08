package com.yanin.thailandtrip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TranslucentBarActivity extends BaseActivity implements PageNavigator{

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent);
        fragmentManager = getSupportFragmentManager();
        showPage();
    }

    public void showPage() {
        Fragment newFragment = ScheduleFragment.newInstance();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.layoutContainer, newFragment);
        transaction.commit();
    }

    @Override
    public void openPage() {
        //TODO to implement
    }
}
