package com.cts.springday2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Rectangle implements Shape {
	
	private double length;
	private double breadth;
	private String name;
	Rectangle(){
		
	}
	public Rectangle(String name) {
		super();
		this.name = name;
	}
	public Rectangle(double length, double breadth) {
		super();
		System.out.println("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double area() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}
	
	//callback methods
	@PostConstruct
	public void fancy() {
		System.out.println("init called..............");
	}
	@PreDestroy
	public void chancy() {
		System.out.println("destroy called.............");
	}

}
