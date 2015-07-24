package com.qianfeng.myapplication.activity;

import android.support.v4.app.Fragment;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qianfeng.myapplication.R;
import com.qianfeng.myapplication.base.BaseActivity;
import com.qianfeng.myapplication.fragment.CinemaFragment;
import com.qianfeng.myapplication.fragment.KotaFragment;
import com.qianfeng.myapplication.fragment.MovieFragment;
import com.qianfeng.myapplication.fragment.PrivilegeFragment;
import com.qianfeng.myapplication.fragment.UserFragment;
import com.qianfeng.myapplication.util.FragmentTabUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements FragmentTabUtils.OnRgsExtraCheckedChangedListener {
    private RadioGroup rgs;
    public List<Fragment> fragments;

    @Override
    protected void loadLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        rgs = (RadioGroup) findViewById(R.id.radioGroup_main_footer);
        RadioButton rb = (RadioButton) rgs.getChildAt(0);
        rb.setChecked(true);//xml文件设置有异常
        fragments = new ArrayList<Fragment>();
        fragments.add(new MovieFragment());
        fragments.add(new CinemaFragment());
        fragments.add(new KotaFragment());
        fragments.add(new PrivilegeFragment());
        fragments.add(new UserFragment());
        FragmentTabUtils fragmentTabUtils = new FragmentTabUtils(fragments, rgs, getSupportFragmentManager(), R.id.frameLayout_main_container);
        fragmentTabUtils.setOnRgsExtraCheckedChangedListener(this);
    }

    @Override
    protected void process() {

    }

    @Override
    protected void setAllClick() {

    }

    @Override
    public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {

    }
}
