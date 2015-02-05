package com.waterworks.watermeter.bean;

import java.sql.Date;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.waterworks.watermeter.base.EntityBase;

/**
 * 客户表
 * 
 * @author Administrator
 * 
 */
@Table(name="Customer")
public class Customer extends EntityBase {

	@Column(column = "customerid")
	// CustomerID NUMBER SEQ_ID,自动增长
	private int customerid;

	@Column(column = "user_no")
	// USER_NO VARCHAR2(20) 用户编号
	private String user_no;

	@Column(column = "write_secleit_no")
	// WRITE_SECleiT_NO VARCHAR2(5) 用户所在的抄表区段(必须是ID，不能是名称)
	private String write_secleit_no;

	@Column(column = "user_name")
	// USER_NAME VARCHAR2(64) 用户名称
	private String user_name;

	@Column(column = "user_address")
	// User_address VARCHAR2(64) 用户地址
	private String user_address;

	@Column(column = "write_sn")
	// WRITE_SN NUMBER(4) 抄表序号
	private int write_sn;

	@Column(column = "assets_no")
	// ASSETS_NO VARCHAR2(24) 表号
	private String assets_no;

	@Column(column = "ys_price")
	// Ys_price Number(8,5) 总水价
	private float ys_price;

	@Column(column = "cw_adw")
	// Cw_adw Number(12,2) 欠费
	private float cw_adw;

	@Column(column = "start_num")
	// START_NUM VARCHAR2(12) 上月数
	private String start_num;

	@Column(column = "end_num")
	// END_NUM VARCHAR2(12) 本月数
	private String end_num;

	@Column(column = "cw_price")
	// Cw_price Number(12,2) 余额
	private float cw_price;

	@Column(column = "total_power")
	// Total_power Number(12) 抄见水量:APP计算时需四舍五入取整，水量不充许有小数点
	private int total_power;

	@Column(column = "total_money")
	// Total_money Number(12,2) 预计水费:水量*总水价，保留两位小数
	private float total_money;

	@Column(column = "state")
	// State Varchar2(2) Y:已抄 N:未抄
	private String state;

	@Column(column = "if_wx")
	// If_wx Varchar2(2) 是否有维修记录：Y有，N没有 该栏位不需要，维护记录通过户好在维修表就能找到维修的记录
	private String if_wx;

	@Column(column = "write_date")
	// Write_date date 抄表时间(取手机的当前时间) 取的是系统时候，由于手机的时间有时候会改变
	private Date write_date;

	@Column(column = "wx_id")
	// Wx_id Varchar2(20) 对应的维修记录表的维修记录号，如果没有维修记录，则为空
	// 该栏位不需要，维护记录通过户好在维修表就能找到维修的记录
	private String wx_id;

	@Column(column = "write_remark")
	// Write_remark Varchar2(128) 备注说明（抄表界面留一个地方输入，方便抄表员简单的记录一些信息）
	private String write_remark;

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

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getWrite_secleit_no() {
		return write_secleit_no;
	}

	public void setWrite_secleit_no(String write_secleit_no) {
		this.write_secleit_no = write_secleit_no;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public int getWrite_sn() {
		return write_sn;
	}

	public void setWrite_sn(int write_sn) {
		this.write_sn = write_sn;
	}

	public String getAssets_no() {
		return assets_no;
	}

	public void setAssets_no(String assets_no) {
		this.assets_no = assets_no;
	}

	public float getYs_price() {
		return ys_price;
	}

	public void setYs_price(float ys_price) {
		this.ys_price = ys_price;
	}

	public float getCw_adw() {
		return cw_adw;
	}

	public void setCw_adw(float cw_adw) {
		this.cw_adw = cw_adw;
	}

	public String getStart_num() {
		return start_num;
	}

	public void setStart_num(String start_num) {
		this.start_num = start_num;
	}

	public String getEnd_num() {
		return end_num;
	}

	public void setEnd_num(String end_num) {
		this.end_num = end_num;
	}

	public float getCw_price() {
		return cw_price;
	}

	public void setCw_price(float cw_price) {
		this.cw_price = cw_price;
	}

	public int getTotal_power() {
		return total_power;
	}

	public void setTotal_power(int total_power) {
		this.total_power = total_power;
	}

	public float getTotal_money() {
		return total_money;
	}

	public void setTotal_money(float total_money) {
		this.total_money = total_money;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIf_wx() {
		return if_wx;
	}

	public void setIf_wx(String if_wx) {
		this.if_wx = if_wx;
	}

	public Date getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}

	public String getWx_id() {
		return wx_id;
	}

	public void setWx_id(String wx_id) {
		this.wx_id = wx_id;
	}

	public String getWrite_remark() {
		return write_remark;
	}

	public void setWrite_remark(String write_remark) {
		this.write_remark = write_remark;
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
