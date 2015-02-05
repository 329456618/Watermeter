package com.waterworks.watermeter.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogUtil {
	/**
	 * 确定取消对话框
	 * 
	 * @param context
	 * @param title
	 * @param mgs
	 * @param listener
	 */
	public static void showDalogOkNo(Context context, String title, String mgs,
			final DialogUtilListener listener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle(title);
		builder.setMessage(mgs);
		// 确定按钮
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				listener.PositiveButton();
			}
		});

		// 取消按钮
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				listener.NegativeButton();
			}
		});
		// 显示对话框
		builder.show();
	}
}
