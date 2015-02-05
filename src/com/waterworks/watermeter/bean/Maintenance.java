package com.waterworks.watermeter.bean;

import java.sql.Date;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.waterworks.watermeter.base.EntityBase;

/*
 * 维修表
 */
@Table(name="Maintenance")
public class Maintenance extends EntityBase {

	@Column(column = "maintenanceid")
	// ID NUMBER SEQ_ID,自动增长
	private int maintenanceid;

	@Column(column = "wx_id")
	// Wx_id Varchar2(20) 与客户抄表数据表形成对应
	private String wx_id;

	@Column(column = "user_no")
	// User_no VARCHAR2(20) 用户编号
	private String user_no;

	@Column(column = "err_nam")
	// Err_NAM VARCHAR2(32) 维修类型 该的字段请使用维修类型的ID NUMBER 类型
	private String err_nam;

	@Column(column = "err_remak")
	// Err_remak Varchar2(128) 采用2000 备注说明
	private String err_remak;

	// @Column(column = "err_jpg")
	// // Err_jpg Varchar2(1024) 图片名称，如果是多张图片，以分号(;)进行分隔，图片名称中不充许存在分号 //
	// // 该字段不需要，该表的ID会与IMGFILE表形成对应；通过修改的ID 就能找到对应的图片
	// private String err_jpg;

	@Column(column = "state")
	// State Varchar2(2) 是否上传 不需要改字段
	private String state;

	@Column(column = "err_date")
	// Err_date date 维修记录时间（取手机的当前时间） 取的是系统时候，由于手机的时间有时候会改变
	private Date err_date;

	@Column(column = "userid")
	// UserID NUMBER 该笔数据由哪个用户添加的
	private int userid;

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
	public int getMaintenanceid() {
		return maintenanceid;
	}
	public void setMaintenanceid(int maintenanceid) {
		this.maintenanceid = maintenanceid;
	}
	public String getWx_id() {
		return wx_id;
	}
	public void setWx_id(String wx_id) {
		this.wx_id = wx_id;
	}
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getErr_nam() {
		return err_nam;
	}
	public void setErr_nam(String err_nam) {
		this.err_nam = err_nam;
	}
	public String getErr_remak() {
		return err_remak;
	}
	public void setErr_remak(String err_remak) {
		this.err_remak = err_remak;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getErr_date() {
		return err_date;
	}
	public void setErr_date(Date err_date) {
		this.err_date = err_date;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	
	
	
}
