package com.waterworks.watermeter.bean;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.waterworks.watermeter.base.EntityBase;

/**
 * 相片表 每条记录只与一个维修表关连
 * 
 * @author Administrator
 * 
 */
@Table(name = "Photo")
public class Photo extends EntityBase {

	// 相片路径
	@Column(column = "path")
	private String path;

	// 维修id
	@Column(column = "maintenanceid")
	private int maintenanceid;

	// 上传进度
	@Column(column = "sum")
	private int sum;

	// 是否上传呢0;没有上传的
	@Column(column = "upload")
	private String upload;

	@Column(column = "str1")
	private String str1;
	@Column(column = "str2")
	private String str2;
	@Column(column = "str3")
	private String str3;
	@Column(column = "str4")
	private String str4;
	@Column(column = "str5")
	private String str5;
	@Column(column = "str6")
	private String str6;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

	public String getStr5() {
		return str5;
	}

	public void setStr5(String str5) {
		this.str5 = str5;
	}

	public String getStr6() {
		return str6;
	}

	public void setStr6(String str6) {
		this.str6 = str6;
	}

	public int getMaintenanceid() {
		return maintenanceid;
	}

	public void setMaintenanceid(int maintenanceid) {
		this.maintenanceid = maintenanceid;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
