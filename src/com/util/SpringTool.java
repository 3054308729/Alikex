package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTool {
	//1.加载Spring核心配置文件，启动Spring容器
	private static final String CONF_FILE = "applicationContext.xml";
	private static ApplicationContext ctx = null;
	
	static {
		ctx = new ClassPathXmlApplicationContext(CONF_FILE);
	}
	//获得对象
	public static Object getBean(String beanId) {
		return ctx.getBean(beanId);
	}
}
