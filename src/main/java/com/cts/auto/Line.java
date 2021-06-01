package com.cts.auto;

public class Line {

	// dependency
	private Point a;
	private Point b;

	public Line() {

	}

  public void setA(Point a) {
	  System.out.println("SetA() method...............");
		this.a = a;
	}

	public void setB(Point b) {
		System.out.println("setB() method...........");
		this.b = b;
	}

public Line(Point a, Point b) { this.a = a; this.b = b; }
	
	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public void drawLine() {
		System.out.println(a + "......................" + b);
	}
}
