package com.waterworks.watermeter.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.waterworks.watermeter.R;
import com.waterworks.watermeter.bean.Section;

/**
 * 下载适配
 * 
 * @author Administrator
 * 
 */
public class SectionAdapter extends BaseAdapter {
	public List<Section> listData;
	public Context context;

	public SectionAdapter(List<Section> listData, Context context) {
		this.listData = listData;
		this.context = context;
		
	}
	
	public void notifyDataSetChanged(List<Section> listData) {
		super.notifyDataSetChanged();
		this.listData = listData;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View v, ViewGroup parent) {
		v= View.inflate(context, R.layout.sectionadapter_item, null);
		return v;
	}
}
