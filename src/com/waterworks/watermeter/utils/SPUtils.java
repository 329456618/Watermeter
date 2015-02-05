package com.waterworks.watermeter.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

import com.lidroid.xutils.db.annotation.Column;
import com.waterworks.watermeter.bean.User;

public class SPUtils {
	private static SharedPreferences sp;// 都保存在这个sp中

	/**
	 * 设置sp
	 * 
	 * @param context
	 */
	public static void setSP(Context context) {
		// sp = PreferenceManager.getDefaultSharedPreferences(context);
		sp = context.getSharedPreferences("watermeter", Context.MODE_PRIVATE);
	}

	// 用户信息
	// 用户登录名字
	// @Column(column = "username")
	// private String username;
	// // 用户密码
	// @Column(column = "userpaw")
	// private String userpaw;
	private static final String USERNAME = "username";
	private static final String USERPAW = "userpaw";

	public static void setUser(String username, String userpaw) {
		Editor e = sp.edit();
		if (!username.isEmpty()) {
			e.putString(USERNAME, username);
		}
		if (!userpaw.isEmpty()) {
			e.putString(USERPAW, userpaw);
		}
		e.commit();
	}

	public static String getUsername() {
		return sp.getString(USERNAME, "");
	}

	public static String getUserpaw() {
		return sp.getString(USERPAW, "");
	}
}
