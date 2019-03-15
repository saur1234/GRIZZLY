package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Hello ob=(Hello)context.getBean("HelloBean");
	System.out.print(ob.getMessage());

    }


}