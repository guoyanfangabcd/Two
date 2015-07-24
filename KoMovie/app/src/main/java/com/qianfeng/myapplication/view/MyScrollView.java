package com.qianfeng.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView {

    View mTopView;
    View mFlowView;

    //构造方法
    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    /**
     * 滑动状态 改变
     *
     * 当Scrollview向上滑动的距离大于等于顶部区域的高度时，
     * 也就是浮动区域A的顶边贴到屏幕顶部的时候，
     * 这是将浮动区域B的可见性设置为VISIBLE即可，否则设置为GONE即可。
     * @param l
     * @param t
     * @param oldl
     * @param oldt
     */
    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {

        super.onScrollChanged(l, t, oldl, oldt);
        if (mTopView != null && mFlowView != null) {//当Scrollview向上滑动的距离大于等于顶部区域的高度时，
            if (t >= mTopView.getHeight()) {
                mFlowView.setVisibility(View.VISIBLE);
            } else {
                mFlowView.setVisibility(View.GONE);
            }
        }
    }

    /**
     *
     *监听浮动view的滚动状态
     * @param topView 顶部区域view，即当ScrollView滑动的高度要大于等于哪个view的时候隐藏floatview
     * @param flowView 浮动view，即要哪个view停留在顶部
     */
    public void listenerFlowViewScrollState(View topView, View flowView) {
        mTopView = topView;
        mFlowView = flowView;
    }

}
