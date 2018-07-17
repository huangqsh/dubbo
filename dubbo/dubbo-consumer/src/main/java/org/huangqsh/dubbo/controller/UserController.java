package org.huangqsh.dubbo.controller;

import javax.annotation.Resource;

import org.huangqsh.dubbo.entity.UserEntity;
import org.huangqsh.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testdubbo")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/add")
	public String add(UserEntity userEntity) {
		userService.add(userEntity);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		userService.deleteById(id);
		return "success";
	}
	
	@RequestMapping("/getById/{id}")
	public String getById(@PathVariable("id") Integer id,ModelMap map) {
		UserEntity userEntity = userService.getById(id);
		map.addAttribute("user", userEntity);
		return "userInfo";
	}
}
