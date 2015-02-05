package com.waterworks.watermeter.bean;

import java.sql.Date;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.waterworks.watermeter.base.EntityBase;

/**
 * 下载管理
 * 
 * @author Administrator
 * 
 */
@Table(name = "Section")
public class Section extends EntityBase {
	// id
	@Column(column = "sectionid")
	private int sectionid;

	// WRITE_SECT_NO VARCHAR2(5) 抄表区段号
	@Column(column = "write_sect_no")
	private String write_sect_no;

	// WRITE_SECT_NAME VARCHAR2(32) 抄表区段名称
	@Column(column = "write_sect_name")
	private String write_sect_name;

	// Write_number Number(5) 应总抄数量
	@Column(column = "write_number")
	private int write_number;

	// Write_name vaRCHAR2(16) 抄表员名称 抄表员请使用ID记录，听过LEFT JOIN 语句带出名称
	@Column(column = "write_name")
	private User write_name;

	// state vaRCHAR2(2) 状态:I未下载 B:已下载 U:已上传
	@Column(column = "state")
	private String state;

	// Down_date date 下载时间
	@Column(column = "down_date")
	private Date down_date;

	// Up_date date 上传时间
	@Column(column = "up_date")
	private Date up_date;

	// Write_yc Number(5) 已抄户数（下载时，自动会给0值，当后续的抄表后，对此值进行更新）
	@Column(column = "write_yc")
	private int write_yc;

	// Write_wc Number(5) 未抄户数(下载时，自动会值为该抄表本的全部户数，后续的抄表时对此值进行更新)
	@Column(column = "write_wc")
	private int write_wc;

	// W_DATE DATE 应抄写日期
	@Column(column = "w_date")
	private Date w_date;

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

	public Section() {
		super();
		// write_sect_no = "10101";
		// write_sect_name = "10101";
		// write_number = 227;
		// w_date = new Date(System.currentTimeMillis());
		// write_name = new User();
		// write_name.setName("陈美玲");
		// state = "I";
	}

	public int getSectionid() {
		return sectionid;
	}

	public void setSectionid(int sectionid) {
		this.sectionid = sectionid;
	}

	public String getWrite_sect_no() {
		return write_sect_no;
	}

	public void setWrite_sect_no(String write_sect_no) {
		this.write_sect_no = write_sect_no;
	}

	public String getWrite_sect_name() {
		return write_sect_name;
	}

	public void setWrite_sect_name(String write_sect_name) {
		this.write_sect_name = write_sect_name;
	}

	public int getWrite_number() {
		return write_number;
	}

	public void setWrite_number(int write_number) {
		this.write_number = write_number;
	}

	public User getWrite_name() {
		return write_name;
	}

	public void setWrite_name(User write_name) {
		this.write_name = write_name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDown_date() {
		return down_date;
	}

	public void setDown_date(Date down_date) {
		this.down_date = down_date;
	}

	public Date getUp_date() {
		return up_date;
	}

	public void setUp_date(Date up_date) {
		this.up_date = up_date;
	}

	public int getWrite_yc() {
		return write_yc;
	}

	public void setWrite_yc(int write_yc) {
		this.write_yc = write_yc;
	}

	public int getWrite_wc() {
		return write_wc;
	}

	public void setWrite_wc(int write_wc) {
		this.write_wc = write_wc;
	}

	public Date getW_date() {
		return w_date;
	}

	public void setW_date(Date w_date) {
		this.w_date = w_date;
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
