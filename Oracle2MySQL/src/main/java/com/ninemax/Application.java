package com.ninemax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ninemax.service.Oracle2MySQL;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("...........................");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		System.out.println("===========================");
		Oracle2MySQL oracle2MySQL = (Oracle2MySQL) context.getBean("oracle2MySQL");
		// Mapper 前綴
		oracle2MySQL.execute("Journal", "Journal");
	}
	
}
