package com.ninemax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ninemax.service.Oracle2MySQL;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("...........................");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		System.out.println("===========================");
		Oracle2MySQL oracle2MySQL = (Oracle2MySQL) context.getBean("oracle2MySQL");
		oracle2MySQL.executeOracle2MySQL("JournalDao", "selectList", "JournalMapper", "insertBatch");
	
	}
	
}
