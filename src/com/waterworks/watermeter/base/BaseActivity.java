package com.waterworks.watermeter.base;

import java.util.ArrayList;
import java.util.List;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.waterworks.watermeter.Constants;
import com.waterworks.watermeter.R;
import com.waterworks.watermeter.bean.Soap;

public class BaseActivity extends Activity {
	public Context context;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		// 设置findbyid 在属性上设置就行呢
		ViewUtils.inject(this);
		// 加入 List中
		((BaseApplication) getApplication()).addActivity(this);
	}

	/**
	 * 得到application
	 * 
	 * @return
	 */
	public BaseApplication getapplication() {
		return (BaseApplication) this.getApplication();
	}

	/**
	 * Toast提示
	 */
	public void makeText(Context context, int id, String text) {
		if (id != 0) {
			text = context.getResources().getString(id);
		}
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 访问webservice的方法
	 * 
	 * @param methodName方法名
	 * @param data参数
	 * @return
	 * @throws Exception
	 */
	public static SoapObject callWS(String methodName, List<Soap> data)
			throws Exception {
		SoapObject result = null;
		if (data == null) {
			data = new ArrayList<Soap>();
		}
		String nameSpace = Constants.nameSpace;
		// webservice的网址
		String URL = Constants.URL;
		String SOAP_ACTION = nameSpace + methodName;
		SoapObject request = new SoapObject(nameSpace, methodName);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER10);
		envelope.dotNet = true; // .net 支持
		for (Soap soap : data) {
			request.addProperty(soap.getName(), soap.getValue());
		}
		envelope.bodyOut = request;
		envelope.setOutputSoapObject(request);
		// 超时 5秒
		// MyAndroidHttpTransport httpTranstation = new
		// MyAndroidHttpTransport(URL
		// + "?WSDL", 1000 * 5);
		@SuppressWarnings("deprecation")
		AndroidHttpTransport httpTranstation = new AndroidHttpTransport(URL,
				5000);
		httpTranstation.call(SOAP_ACTION, envelope);
		result = (SoapObject) envelope.getResponse();
		return result;
	}
}
