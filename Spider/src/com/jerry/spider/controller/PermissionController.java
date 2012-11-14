package com.jerry.spider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jerry.spider.service.IPermissionService;

/**
 * 权限控制器类
 * 
 * @author Jerry
 * 2012-11-13
 */

@Controller
public class PermissionController {

	@Autowired
	private IPermissionService permissionService;

	
}
