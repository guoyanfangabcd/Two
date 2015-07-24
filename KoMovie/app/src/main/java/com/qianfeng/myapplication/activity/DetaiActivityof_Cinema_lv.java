package com.qianfeng.myapplication.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qianfeng.myapplication.R;
import com.qianfeng.myapplication.base.BaseActivity;
import com.qianfeng.myapplication.fragment.BuyTicket;
import com.qianfeng.myapplication.fragment.CinemaFragment;
import com.qianfeng.myapplication.fragment.Comment;
import com.qianfeng.myapplication.fragment.Introduce_cinema;
import com.qianfeng.myapplication.fragment.KotaFragment;
import com.qianfeng.myapplication.fragment.MovieFragment;
import com.qianfeng.myapplication.fragment.PrivilegeFragment;
import com.qianfeng.myapplication.fragment.UserFragment;
import com.qianfeng.myapplication.util.FragmentTabUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 15-7-23.
 */
public class DetaiActivityof_Cinema_lv extends BaseActivity implements FragmentTabUtils.OnRgsExtraCheckedChangedListener{
    public List<Fragment> fragments;
    private LinearLayout baidumap;

    @Override
    protected void loadLayout() {
        setContentView(R.layout.detailof_ciname);
    }

    @Override
    protected void initView() {
         baidumap=(LinearLayout)findViewById(R.id.baidumap);
        RadioGroup rg = (RadioGroup)findViewById(R.id.button);
        RadioButton rb = (RadioButton) rg.getChildAt(0);
        rb.setChecked(true);
        fragments = new ArrayList<Fragment>();
        fragments.add(new BuyTicket());
        fragments.add(new Introduce_cinema());
        fragments.add(new Comment());

        FragmentTabUtils fragmentTabUtils = new FragmentTabUtils(fragments, rg, getSupportFragmentManager(), R.id.frameLayout_main_container1);
        fragmentTabUtils.setOnRgsExtraCheckedChangedListener(this);
    }

    @Override
    protected void process() {

    }

    @Override
    protected void setAllClick() {
        baidumap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetaiActivityof_Cinema_lv.this,LocationActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {

    }
}
