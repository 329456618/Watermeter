package com.waterworks.watermeter.activitys.upload;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.waterworks.watermeter.R;
import com.waterworks.watermeter.adapter.SectionAdapter;
import com.waterworks.watermeter.base.BaseActivity;
import com.waterworks.watermeter.bean.Section;
import com.waterworks.watermeter.utils.DialogUtil;
import com.waterworks.watermeter.utils.DialogUtilListener;

/**
 * 上传页面
 * 
 * @author Administrator
 * 
 */
@ContentView(R.layout.upload)
public class UploadActivity extends BaseActivity implements OnItemClickListener {
	private List<Section> listData;
	@ViewInject(R.id.listview)
	private ListView listview;
	@ViewInject(R.id.title)
	private TextView title;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		title.setText("数据上传");
		listData = new ArrayList<Section>();
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listData.add(new Section());
		listview.setAdapter(new SectionAdapter(listData, context));

		listview.setOnItemClickListener(this);
	}

	// listview事件处理
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// 对话框
		DialogUtil.showDalogOkNo(context, null, "确定要上传区段" + position
				+ "数据，请确认是否以抄完？", new DialogUtilListener() {
			public void PositiveButton() {
				makeText(context, 0, "确定");
			}

			public void NegativeButton() {
				makeText(context, 0, "取消");
			}
		});
	}
}
