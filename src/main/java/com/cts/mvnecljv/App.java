package com.cts.mvnecljv;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //1.instantiate spring core container
        @SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("D:\\core\\Eclipsemaven\\go-second-eclipse\\src\\main\\java\\beans.xml"));
        System.out.println("Factory is ready....");
        
        Object obj = factory.getBean("bRef");
        B b=(B) obj;
        System.out.println(b.useMessage(" 1.2.3........Spring IOC Launched..........HURRAY#@!"));
        
        B b1=(B) obj;
        System.out.println(b==b1);
    }
}
