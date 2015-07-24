package com.qianfeng.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.qianfeng.myapplication.R;

/**
 * Created by Administrator on 15-7-23.
 */
public class Lv_CinameAdapter extends BaseAdapter {
    private Context context;
    public Lv_CinameAdapter(Context context) {
        this.context=context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.itemof_ciname_lv,null);
        return convertView;
    }
}
