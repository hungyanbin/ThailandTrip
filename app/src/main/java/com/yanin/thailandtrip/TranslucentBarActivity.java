package com.yanin.thailandtrip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.yanin.thailandtrip.page.Page;
import com.yanin.thailandtrip.page.PageNavigator;

public class TranslucentBarActivity extends BaseActivity implements PageNavigator {

    private FragmentManager fragmentManager;
    private Page page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent);
        fragmentManager = getSupportFragmentManager();

        loadPage();
        showPage();
    }

    private void loadPage() {
        Bundle data = getIntent().getExtras();
        page = (Page) data.getSerializable(ARG_PAGE);
    }

    public void showPage() {
        Fragment newFragment = page.getFragment();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.layoutContainer, newFragment);
        transaction.commit();
    }

    @Override
    public void openPage(Page page) {
        //TODO to implement
    }

    @Override
    public void toLastPage() {
        onBackPressed();
    }
}
