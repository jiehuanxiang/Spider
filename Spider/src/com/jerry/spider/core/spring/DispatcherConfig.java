package com.jerry.spider.core.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jerry.spider", 
			   resourcePattern = "com.jerry.spider..*Impl")
public class DispatcherConfig {

	
	
	
}
