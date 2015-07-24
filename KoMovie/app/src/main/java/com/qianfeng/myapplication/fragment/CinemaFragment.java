package com.qianfeng.myapplication.fragment;


import android.app.Fragment;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.qianfeng.myapplication.R;
import com.qianfeng.myapplication.activity.DetaiActivityof_Cinema_lv;
import com.qianfeng.myapplication.adapter.Lv_CinameAdapter;
import com.qianfeng.myapplication.base.BaseFragment;
import com.qianfeng.myapplication.view.ListViewForScrollView;
import com.qianfeng.myapplication.view.MyScrollView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CinemaFragment extends BaseFragment implements View.OnClickListener {


    private MyScrollView mScrollView;
    private RelativeLayout mFlowLayout;
    private ListViewForScrollView listViewForScrollView;
    private ImageView mImageView;

    @Override
    protected View loadView(LayoutInflater inflater) {
        View parent = inflater.inflate(R.layout.fragment_cinema, null);
        return parent;
    }

    @Override
    protected void initView(View view) {

        listViewForScrollView = (ListViewForScrollView) view.findViewById(R.id.lv_cinema);
        mScrollView = (MyScrollView) view.findViewById(R.id.scroll_view);
        mImageView = (ImageView) view.findViewById(R.id.vp_ciname);
        mFlowLayout = (RelativeLayout) view.findViewById(R.id.cinema_filter);
//ʵ������Ч��
        listViewForScrollView.setFocusable(false);
        //listview.setOnItemClickListener(this);

        setListViewHeightBasedOnChildren(listViewForScrollView);
        //��������view�Ĺ���״̬
        //�� ImageView ����View
        mScrollView.listenerFlowViewScrollState(mImageView, mFlowLayout);
        //��ScrollView��������ʼλ��
        mScrollView.scrollTo(0, 0);
        //��� �����ؼ��� ����¼�
        mFlowLayout.setOnClickListener(this);

    }

    @Override
    protected void process() {
        Lv_CinameAdapter adapter = new Lv_CinameAdapter(getActivity());
        listViewForScrollView.setAdapter(adapter);
    }

    @Override
    protected void setAllClick() {
        listViewForScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), DetaiActivityof_Cinema_lv.class);
                startActivity(intent);
            }
        });
    }


    public void setListViewHeightBasedOnChildren(ListViewForScrollView listViewForScrollView) {
        // ��ȡListView��Ӧ��Adapter
        ListAdapter listAdapter = listViewForScrollView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            // listAdapter.getCount()�������������Ŀ
            View listItem = listAdapter.getView(i, null, listViewForScrollView);
            // ��������View �Ŀ��
            listItem.measure(0, 0);
            // ͳ������������ܸ߶�
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listViewForScrollView.getLayoutParams();
        params.height = totalHeight + (listViewForScrollView.getDividerHeight() * (listAdapter.getCount() - 1));
        // listView.getDividerHeight()��ȡ�����ָ���ռ�õĸ߶�   + (staggeredGridView. * (listAdapter.getCount() - 1))
        // params.height���õ�����ListView������ʾ��Ҫ�ĸ߶�
        listViewForScrollView.setLayoutParams(params);
    }


    @Override
    public void onClick(View v) {
        //��ScrollView��������ʼλ��
        mScrollView.scrollTo(0, 0);
    }


}


