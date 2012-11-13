package com.jerry.spider.core.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 无web.xml式 基于代码配置的servlet3.0
 * 
 * @author Jerry
 * 2012-11-10
 */

public class WebAppInitializer implements WebApplicationInitializer {

	private final String SPRING_SERVLET_PATH = "/WEB-INF/resources/spring/dispatcher-config.xml";
	private final String SPRING_SERVLET_NAME = "dispatcher";
	private final String SPRING_MAPPING = "/";
	
	
	/*
	 * 用于xml文件的servlet 3.0配置方式
	 * (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
//	@Override
//	public void onStartup(ServletContext container) throws ServletException {
//		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//		appContext.setConfigLocation(SPRING_SERVLET_PATH);
//		
//		Dynamic dispatcher = container.addServlet(SPRING_SERVLET_NAME, new DispatcherServlet(appContext));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping(SPRING_MAPPING);
//		
//	}
	
	
	/*
	 * 用于类配置的servlet 3.0配置方式
	 * (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(DispatcherConfig.class);
		
		ServletRegistration.Dynamic dispatcher = container.addServlet(SPRING_SERVLET_NAME, new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping(SPRING_MAPPING);
		
	}
	
	
}
