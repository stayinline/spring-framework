package com.spring.debug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

class MyTestBeanTests {

	@Test
	void testSimpleLoad() {
		testBeanFactory();
	}

	/**
	 * 测试不同的bean工厂
	 * 管理的IOC容器也是不一样的
	 */
	private void testBeanFactory() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		A a = (A) bf.getBean("a");
		System.out.println(a);    // com.spring.debug.A@733843b2

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		A a2 = (A) context.getBean("a");
		System.out.println(a2);    // com.spring.debug.A@7a4957b1

		/*
		 * 这两个的不一样，本质原因是因为两个bean工厂不一样
		 */

	}

}