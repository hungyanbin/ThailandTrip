package com.yanin.thailandtrip.drawer;

public interface DrawerContract {

    interface View{
        boolean isOpen();
        void close();
    }

    interface Presenter{
        void onBackPressed();
    }
}
