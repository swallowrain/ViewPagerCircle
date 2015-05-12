package com.example.viewpagercircle;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends Activity {
	ViewPager viewPager;
	ArrayList<View> list;
	View lay1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LayoutInflater inflater = getLayoutInflater();
		list = new ArrayList<View>();
		list.add(inflater.inflate(R.layout.layout1, null));
		list.add(inflater.inflate(R.layout.layout2, null));
		list.add(inflater.inflate(R.layout.layout3, null));

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(new MyAdapter());
		viewPager.setOnPageChangeListener(new MyListener());
		viewPager.setCurrentItem(300);

	}

	class MyAdapter extends PagerAdapter {
		@Override
		public int getCount() {
			return Integer.MAX_VALUE;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public int getItemPosition(Object object) {
			// TODO Auto-generated method stub
			return super.getItemPosition(object);
		}

		@Override
		public void destroyItem(View arg0, int arg1, Object arg2) {
			// ((ViewPager) arg0).removeView(list.get(arg1));
		}

		@Override
		public Object instantiateItem(View arg0, int arg1) {
			// TODO Auto-generated method stub
			try {
				((ViewPager) arg0).addView(list.get(arg1 % list.size()), 0);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list.get(arg1 % list.size());
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {
			// TODO Auto-generated method stub
		}

		@Override
		public Parcelable saveState() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void startUpdate(View arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void finishUpdate(View arg0) {
			// TODO Auto-generated method stub
		}
	}

	class MyListener implements OnPageChangeListener {
		//滑動狀態改變時
		@Override
		public void onPageScrollStateChanged(int arg0) {

		}

		//當前頁面被滑動時
		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			
		}

		//當新的頁面被選中時
		@Override
		public void onPageSelected(int arg0) {
			
		}
	}
}