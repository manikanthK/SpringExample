package com.spring.common;



public class Order {
	
	 
	private int num;
	@Override
	public String toString() {
		return "Order [num=" + num + ", name=" + name + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
		

}
