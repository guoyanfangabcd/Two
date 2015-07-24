package com.qianfeng.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by keven on 15/7/10.
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = loadView(inflater);
        initView(view);
        process();
        setAllClick();
        return view;
    }

    protected abstract View loadView(LayoutInflater inflater);

    protected abstract void initView(View view);

    protected abstract void process();

    protected abstract void setAllClick();


}
