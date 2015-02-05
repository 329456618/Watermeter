package com.waterworks.watermeter.base;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Application;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.util.LogUtils;
import com.waterworks.watermeter.utils.SPUtils;

public class BaseApplication extends Application {
	public static DbUtils db;

	public void onCreate() {
		super.onCreate();
		// log管理
		LogUtils.customTagPrefix = "li";
		LogUtils.allowI = true;
		db = DbUtils.create(this, "watermeter");
		SPUtils.setSP(this);
	}

	/**
	 * 缓存activity对象索引
	 */
	public List<Activity> activities = new ArrayList<Activity>();;

	public List<Activity> getActivities() {
		return activities;
	}

	public void addActivity(Activity mActivity) {
		activities.add(mActivity);
	}
}
