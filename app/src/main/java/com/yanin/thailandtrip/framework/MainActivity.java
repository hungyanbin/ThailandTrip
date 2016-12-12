package com.yanin.thailandtrip.framework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;

import com.yanin.thailandtrip.MainContract;
import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.drawer.DrawerContract;
import com.yanin.thailandtrip.drawer.DrawerPresenter;
import com.yanin.thailandtrip.drawer.DrawerView;
import com.yanin.thailandtrip.page.Page;
import com.yanin.thailandtrip.page.PageFactory;
import com.yanin.thailandtrip.page.PageNavigator;

public class MainActivity extends BaseActivity implements MainContract.View, PageNavigator {

    private DrawerContract.View drawerView;
    private DrawerContract.Presenter drawerPresenter;
    private FragmentManager fragmentManager;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = new DrawerView(drawer, toolbar, this);
        drawerPresenter = new DrawerPresenter(drawerView, this);
        drawerView.bindPresenter(drawerPresenter);
        fragmentManager = getSupportFragmentManager();
        showPage(new PageFactory.CalendarPage());
    }

    public Toolbar getToolbar(){
        return toolbar;
    }

    private void showPage(Page page) {
        Fragment newFragment = page.getFragment();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.layoutContainer, newFragment);
        transaction.commit();
    }

    @Override
    public void replaceCurrentPage(Page page) {
        BaseFragment fragment = page.getFragment();
        String tag = fragment.getClass().getSimpleName();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layoutContainer, fragment, tag);
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

    @Override
    public void openPage(Page page) {
        Intent intent = new Intent(this, TranslucentBarActivity.class);
        intent.putExtra(ARG_PAGE, page);
        startActivity(intent);
    }

    @Override
    public void toLastPage() {
        onBackPressed();
    }
}
