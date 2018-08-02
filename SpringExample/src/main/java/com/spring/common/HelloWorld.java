package com.spring.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	
	private Order or;


	public Order getOr() {
		return or;
	}


	public void setOr(Order or) {
		this.or = or;
	}


	@Override
	public String toString() {
		return "HelloWorld [or=" + or.toString() + ", name=" + name + "]";
	}


	public String getName() {
		return name;
	}

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name+" Order ID :"+ or.toString());
	}

	
	public HelloWorld() {
		super();
	}
}
