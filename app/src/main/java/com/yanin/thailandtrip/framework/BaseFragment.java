package com.yanin.thailandtrip.framework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.trello.rxlifecycle2.components.support.RxFragment;
import com.yanin.thailandtrip.R;
import com.yanin.thailandtrip.framework.BaseActivity;
import com.yanin.thailandtrip.page.PageNavigator;

public class BaseFragment extends RxFragment{

    protected PageNavigator pageNavigator;
    protected View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        pageNavigator = (PageNavigator)activity;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rootView = view;
    }

    protected View findViewById(@IdRes int id){
        return rootView.findViewById(id);
    }

    protected void setupToolbar(Toolbar toolbar){
        setupToolbar(toolbar, R.string.app_name);
    }

    protected void setupToolbar(Toolbar toolbar, @StringRes int title){
        @DrawableRes int homeIcon = R.drawable.ic_back_white;
        BaseActivity activity = (BaseActivity) getActivity();
        activity.setSupportActionBar(toolbar);

        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle(getString(title));

        toolbar.setNavigationIcon(homeIcon);
        toolbar.setTag(homeIcon);
        toolbar.setTitleTextColor(ContextCompat.getColor(getContext(), R.color.white));
    }


    protected void setupMainToolbar(Toolbar toolbar, @StringRes int title){
        toolbar.setTitle(getString(title));
        toolbar.setTitleTextColor(ContextCompat.getColor(getContext(), R.color.white));
    }

}
