package com.qianfeng.myapplication.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		loadLayout();
		initView();
		process();
		setAllClick();
	}

	protected abstract void loadLayout();

	protected abstract void initView();

	protected abstract void process();

	protected abstract void setAllClick();

}
