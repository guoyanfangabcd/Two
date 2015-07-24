package com.qianfeng.myapplication.activity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;
import com.qianfeng.myapplication.R;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

/**
 * 演示定位功能
 */
public class LocationActivity extends Activity {
	private MapView bmapMapView;
	private BaiduMap bMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SDKInitializer.initialize(getApplicationContext());
		setContentView(R.layout.activity_basemap);
		bmapMapView=(MapView) findViewById(R.id.bmapView);
		bMap=bmapMapView.getMap();


		BitmapDescriptor bm=BitmapDescriptorFactory.fromResource(R.mipmap.icon_gcoding);

		final LatLng latLng=new LatLng(39.915599, 116.403694);//116.403694,39.915599
		//3? ????
		OverlayOptions options=new MarkerOptions().position(latLng).icon(bm).title("????");
		//4.?
		bMap.addOverlay(options);

		//??
		bMap.setOnMarkerClickListener(new BaiduMap.OnMarkerClickListener() {
			//??????????
			@Override
			public boolean onMarkerClick(Marker marker) {
//
				Button button=new Button(LocationActivity.this);
				button.setBackgroundColor(Color.BLUE);
				button.setText(marker.getTitle());//??????
				button.setTextColor(Color.RED);
				;
				BitmapDescriptor bitmapDescriptor=BitmapDescriptorFactory.fromView(button);

				InfoWindow infoWindow=new InfoWindow(bitmapDescriptor,latLng,-50, new InfoWindow.OnInfoWindowClickListener() {
					//???
					@Override
					public void onInfoWindowClick() {
						bMap.hideInfoWindow();//?
					}
				});
				bMap.showInfoWindow(infoWindow);//2.?????
				return false;
			}
		});
	}

}
















