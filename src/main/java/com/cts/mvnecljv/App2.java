package com.cts.mvnecljv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		B b=(B) context.getBean("bRef");
		System.out.println(b.useMessage("Using ApplicationContext Container "));
		System.out.println(context.isSingleton("bRef"));
		System.out.println(context.isPrototype("aRef"));
	} 

}
