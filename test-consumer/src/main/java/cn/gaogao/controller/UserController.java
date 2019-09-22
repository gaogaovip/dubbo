package cn.gaogao.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.gaogao.api.UserService;

@RestController
public class UserController {
	
	@Reference(version="1.0.0",interfaceClass=UserService.class)
	private UserService userService;
	
	@RequestMapping("/say")
	public String say(){
		
		return userService.say();
		
	}
	
}
