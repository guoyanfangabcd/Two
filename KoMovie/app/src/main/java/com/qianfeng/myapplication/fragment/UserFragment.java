package com.qianfeng.myapplication.fragment;


import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

import com.qianfeng.myapplication.R;
import com.qianfeng.myapplication.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends BaseFragment {


    @Override
    protected View loadView(LayoutInflater inflater) {
        View parent=inflater.inflate(R.layout.fragment_user,null);
        return parent;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void process() {

    }

    @Override
    protected void setAllClick() {

    }
}
