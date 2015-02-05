package com.waterworks.watermeter.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.waterworks.watermeter.R;
import com.waterworks.watermeter.base.BaseActivity;

/**
 * 登录页面
 * 
 * @author Administrator
 * 
 */
@ContentView(R.layout.login)
public class LoginActivity extends BaseActivity {
	@ViewInject(R.id.edit_username)
	private EditText edit_username;
	@ViewInject(R.id.edit_userpwd)
	private EditText edit_userpwd;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	// 登录
	@OnClick(R.id.but_usersub)
	public void but_usersub(View btn) {
		startActivity(new Intent(context, MainActivity.class));
		finish();
	}

	// 退出
	@OnClick(R.id.but_exit)
	public void but_exit(View btn) {
		finish();
	}
}
