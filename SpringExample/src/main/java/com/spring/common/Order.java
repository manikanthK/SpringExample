package com.spring.common;



public class Order {
	
	 
	private int num;
	 
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
	public void check()
	{
		System.out.println("inside the Order class");
	}
		

}
