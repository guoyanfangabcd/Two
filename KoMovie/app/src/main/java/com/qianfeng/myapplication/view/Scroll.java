package com.qianfeng.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 15-7-22.
 */
public class Scroll extends TextView {

    public Scroll(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Scroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Scroll(Context context) {
        super(context);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

}