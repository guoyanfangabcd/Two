package com.qianfeng.myapplication.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.qianfeng.myapplication.R;
import com.qianfeng.myapplication.adapter.Lv_Comment_Adapter;
import com.qianfeng.myapplication.base.BaseFragment;

/**
 * Created by Administrator on 15-7-23.
 */
public class Comment extends BaseFragment {
    private ListView comment_lv;

    @Override
    protected View loadView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.comment, null);
        return view;
    }

    @Override
    protected void initView(View view) {
      comment_lv = (ListView) view.findViewById(R.id.comment_lv);
    }

    @Override
    protected void process() {
        Lv_Comment_Adapter adapter=new Lv_Comment_Adapter(getActivity());
        comment_lv.setAdapter(adapter);
    }

    @Override
    protected void setAllClick() {

    }
}
