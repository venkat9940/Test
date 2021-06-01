package com.cts.springday2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIoc {

	public static void main(String[] args) {
		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			context.registerShutdownHook();
			Shape shape = (Shape) context.getBean("rect");
			shape=shape = (Shape) context.getBean("rect1");
			shape=shape = (Shape) context.getBean("rect2");
			System.out.println(shape.area());
	}
}
