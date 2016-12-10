package com.yanin.thailandtrip.drawer;

import android.support.annotation.IdRes;

import com.yanin.thailandtrip.MainContract;
import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.page.PageFactory;

public class DrawerPresenter implements DrawerContract.Presenter{

    private DrawerContract.View view;
    private MainContract.View mainView;
    @IdRes private int currentSelectedMenu = R.id.nav_calendar;

    public DrawerPresenter(DrawerContract.View view, MainContract.View mainView) {
        this.view = view;
        this.mainView = mainView;
    }

    @Override
    public void onMenuSelected(@IdRes int id) {
        if(currentSelectedMenu == id){
            return;
        }

        if (id == R.id.nav_calendar) {
            mainView.replaceCurrentPage(new PageFactory.CalendarPage());
        } else if (id == R.id.nav_gallery) {
            mainView.replaceCurrentPage(new PageFactory.ImagesPage());
        } else if (id == R.id.nav_map) {
            mainView.replaceCurrentPage(new PageFactory.ImagesPage());
        }

        currentSelectedMenu = id;
    }

    @Override
    public void onBackPressed() {
        if(view.isOpen()){
            view.close();
        }else{
            mainView.close();
        }
    }
}
