package com.yanin.thailandtrip.page;

import com.yanin.thailandtrip.BaseFragment;

import java.io.Serializable;

public abstract class Page implements Serializable{

    public abstract BaseFragment getFragment();
}
