package com.warmwind.tarcle.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.warmwind.tarcle.R;
import com.warmwind.tarcle.activity.PersonInfoActivity;
import com.warmwind.tarcle.activity.SettingActivity;

public class MeFragment extends Fragment {
	
	
	private View mParent;
	private FragmentActivity mActivity;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_me, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mParent = getView();
		mActivity = getActivity();
		mActivity.findViewById(R.id.meRelative).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(mActivity, PersonInfoActivity.class);
				intent.putExtra("click_key", "personImg");
				startActivityForResult(intent,0);
			}
		
		});
		mActivity.findViewById(R.id.meSetingTurn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(mActivity, SettingActivity.class);
				intent.putExtra("click_key", "setting");
				startActivityForResult(intent,0);
			}
		
		});
	}
	
	
	

}
