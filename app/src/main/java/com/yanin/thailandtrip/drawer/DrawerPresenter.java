package com.yanin.thailandtrip.drawer;

import com.yanin.thailandtrip.MainContract;

public class DrawerPresenter implements DrawerContract.Presenter{

    private DrawerContract.View view;
    private MainContract.View mainView;

    public DrawerPresenter(DrawerContract.View view, MainContract.View mainView) {
        this.view = view;
        this.mainView = mainView;
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
