package com.ninemax.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 
 * @author NINEMAX
 *
 */

@Component
public class Oracle2MySQL {

	@Autowired
	ApplicationContext context;
	
	public void execute(String oracle, String mysql) {
		
		// 反射获取dao层方法
		try {
			Object objectOracle = context.getBean(oracle + "Dao");
			Method oracleMethod = objectOracle.getClass().getMethod("query" + oracle, null);
			Object objectMysql = context.getBean((new StringBuilder()).append(Character.toLowerCase(mysql.charAt(0))).append(mysql.substring(1)).toString() + "Mapper");
			Method mysqlMethod = objectMysql.getClass().getMethod("insert" + mysql, List.class);
			System.out.println(objectOracle);
			mysqlMethod.invoke(objectMysql, oracleMethod.invoke(objectOracle, new Object[0]));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
