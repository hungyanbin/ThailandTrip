package com.yanin.thailandtrip;

import com.yanin.thailandtrip.page.Page;

public interface MainContract {

    interface View{
        void close();
        void replaceCurrentPage(Page page);
    }
}
