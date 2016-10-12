package com.ninemax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ninemax.service.Oracle2MySQL;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		Oracle2MySQL oracle2MySQL = (Oracle2MySQL) context.getBean("oracle2MySQL");
		oracle2MySQL.execute("", "");
	}
	
}
