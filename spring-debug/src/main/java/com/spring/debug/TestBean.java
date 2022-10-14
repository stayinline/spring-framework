package com.spring.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {


	public static void main(String[] args) {
		testBean();

		System.out.println("test spring");

	}

     private static void testBean() {
            String xmlConfig = "spring-bean.xml";

            ApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);
            Object a = context.getBean("a");

            System.out.println(a);
     }
}