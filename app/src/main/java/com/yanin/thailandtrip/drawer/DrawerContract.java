package com.yanin.thailandtrip.drawer;

import android.support.annotation.IdRes;

public interface DrawerContract {

    interface View{
        boolean isOpen();
        void close();
        void bindPresenter(Presenter presenter);
    }

    interface Presenter{
        void onBackPressed();
        void onMenuSelected(@IdRes int id);
    }
}
