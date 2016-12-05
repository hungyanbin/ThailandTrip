package com.yanin.thailandtrip;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;

import com.yanin.thailandtrip.drawer.DrawerContract;
import com.yanin.thailandtrip.drawer.DrawerPresenter;
import com.yanin.thailandtrip.drawer.DrawerView;

public class MainActivity extends BaseActivity implements MainContract.View{

    private DrawerContract.View drawerView;
    private DrawerContract.Presenter drawerPresenter;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = new DrawerView(drawer, toolbar, this);
        drawerPresenter = new DrawerPresenter(drawerView, this);
        fragmentManager = getSupportFragmentManager();
        showPage();
    }

    public void showPage() {
        Fragment newFragment = CalendarFragment.newInstance();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.layoutContainer, newFragment);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        drawerPresenter.onBackPressed();
    }

    @Override
    public void close() {
        super.onBackPressed();
    }
}