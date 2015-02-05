package com.waterworks.watermeter.activitys;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.waterworks.watermeter.R;
import com.waterworks.watermeter.activitys.download.DownloadActivity;
import com.waterworks.watermeter.activitys.maintenance.MaintenanceActivity;
import com.waterworks.watermeter.activitys.meterreading.MeterreadingActivity;
import com.waterworks.watermeter.activitys.upload.UploadActivity;
import com.waterworks.watermeter.base.BaseActivity;

/*
 * 主页面
 */
@ContentView(R.layout.main)
public class MainActivity extends BaseActivity implements OnItemClickListener {
	public static String[] drawableString = { "数据下载", "数据上传", "抄表管理", "维修记录" };
	public static int[] drawableid = { R.drawable.manual_1,
			R.drawable.manual_2, R.drawable.manual_3, R.drawable.manual_4 };

	@ViewInject(R.id.brainheroall)
	private GridView gv;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		gv.setAdapter(new MainAdapter());
		gv.setOnItemClickListener(this);
		gv.setSelector(new ColorDrawable(Color.TRANSPARENT));

	}

	// 事件
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		System.out.println(position);
		switch (position) {
		case 0:
			// "数据下载",
			startActivity(new Intent(context, DownloadActivity.class));
			break;
		case 1:
			// "数据上传",
			startActivity(new Intent(context, UploadActivity.class));
			break;
		case 2:
			// "抄表管理",
			startActivity(new Intent(context, MeterreadingActivity.class));
			break;
		case 3:
			// "维修记录" };
			startActivity(new Intent(context, MaintenanceActivity.class));
			break;
		default:
			break;
		}
	}

	// 适配器
	class MainAdapter extends BaseAdapter {
		public int getCount() {
			return drawableid.length;
		}

		public Object getItem(int position) {
			return drawableid[position];
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View v, ViewGroup parent) {
			v = View.inflate(context, R.layout.main_gridview_item, null);
			ImageView ItemImage = (ImageView) v.findViewById(R.id.ItemImage);
			ItemImage.setImageResource(drawableid[position]);
			TextView ItemText = (TextView) v.findViewById(R.id.ItemText);
			ItemText.setText(drawableString[position]);
			return v;
		}
	}

	// 退出调用
	private long exitTime = 0;

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK
				&& event.getAction() == KeyEvent.ACTION_DOWN) {
			if ((System.currentTimeMillis() - exitTime) > 2000) {
				Toast.makeText(getApplicationContext(), "再按一次退出程序",
						Toast.LENGTH_SHORT).show();
				exitTime = System.currentTimeMillis();
			} else {
				finish();
				System.exit(0);
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
