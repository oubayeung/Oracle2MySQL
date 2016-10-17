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
	
	/**
	 * <p>Oracle 数据复制到 MySQL 执行方法</p>
	 * @param oracleMapperName
	 * 		<li>MyBatis oracle Mapper接口名</li>
	 * @param oracleExcuteMethodName
	 * 		<li>MyBatis oracle Mapper接口执行方法名</li>
	 * @param mysqlMapperName
	 * 		<li>MyBatis mysql Mapper接口名</li>
	 * @param mysqlExcuteMethodName
	 * 		<li>MyBatis mysql Mapper接口执行方法名</li>
	 */
	public void executeOracle2MySQL(String oracleMapperName, String oracleExcuteMethodName, String mysqlMapperName, String mysqlExcuteMethodName) {
		
		// 反射获取dao层方法
		try {
			Object objectOracle = context.getBean(oracleMapperName);
			Method oracleMethod = objectOracle.getClass().getMethod(oracleExcuteMethodName, null);
			
			Object objectMysql = context.getBean(mysqlMapperName);
			Method mysqlMethod = objectMysql.getClass().getMethod(mysqlExcuteMethodName, List.class);
			System.out.println(objectOracle);
			mysqlMethod.invoke(objectMysql, oracleMethod.invoke(objectOracle, new Object[0]));
			System.out.println("迁移成功！");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
