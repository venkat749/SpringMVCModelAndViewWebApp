package com.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.model.User;
import com.springMVC.service.UserService;

@Controller
public class UserControllerClass {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/listUsers", method=RequestMethod.GET)
	public ModelAndView registerSuccess(ModelAndView model) {
		model.setViewName("userList");
		List<User> userList = userService.getList();
		model.addObject("userList", userList);
		return model;
	}
}
