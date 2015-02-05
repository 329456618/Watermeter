package com.waterworks.watermeter.bean;

import java.io.Serializable;

/**
 * 访问网络时传值的类
 * 
 * @author Administrator
 * 
 */
public class Soap implements Serializable {
	private String name;
	private Object value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Soap(String name, Object value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Soap() {
		super();
	}

	public String toString() {
		return "\nSoap [name=" + name + ", value=" + value + "]";
	}
}
