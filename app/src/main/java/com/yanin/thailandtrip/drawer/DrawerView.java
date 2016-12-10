package com.yanin.thailandtrip.drawer;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.yanin.thailandtrip.R;

public class DrawerView implements DrawerContract.View{

    private DrawerLayout drawer;
    private Activity activity;
    private Toolbar toolbar;
    private DrawerContract.Presenter presenter;

    public DrawerView(DrawerLayout drawer, Toolbar toolbar, Activity activity) {
        this.drawer = drawer;
        this.activity = activity;
        this.toolbar = toolbar;
        init();
    }

    public void bindPresenter(DrawerContract.Presenter presenter){
        this.presenter = presenter;
    }

    private void init(){
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                activity, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) drawer.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(onNavigationItemSelectedListener);
    }

    private NavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            item -> {
                int id = item.getItemId();
                presenter.onMenuSelected(id);

                drawer.closeDrawer(GravityCompat.START);
                return true;
            };

    @Override
    public boolean isOpen() {
        return drawer.isDrawerOpen(GravityCompat.START);
    }

    @Override
    public void close() {
        drawer.closeDrawer(GravityCompat.START);
    }
}
