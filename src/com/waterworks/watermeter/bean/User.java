package com.waterworks.watermeter.bean;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.waterworks.watermeter.base.EntityBase;
/**
 * 用户表
 * @author Administrator
 *
 */
@Table(name="User")
public class User extends EntityBase {
	// 用户id
	@Column(column = "userid")
	private int userid;
	// 用户登录名字
	@Column(column = "username")
	private String username;
	// 用户密码
	@Column(column = "userpaw")
	private String userpaw;
	// 用户名
	@Column(column = "name")
	private String name;
	
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
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpaw() {
		return userpaw;
	}
	public void setUserpaw(String userpaw) {
		this.userpaw = userpaw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
