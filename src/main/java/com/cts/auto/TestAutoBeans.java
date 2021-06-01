package com.cts.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoBeans {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("auto-beans.xml");
		Line line=(Line) context.getBean("line");
		line.drawLine();
		System.out.println(line.getA().getX()+"......................"+line.getA().getY());
		System.out.println(line.getB().getX()+"......................"+line.getB().getY());
		//Point pointA=(Point) context.getBean("a");
		//System.out.println(pointA.getX()+"......................"+pointA.getY());

	}

}
