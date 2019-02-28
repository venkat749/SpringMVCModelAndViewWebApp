package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.UserDAO;
import com.springMVC.model.User;

@Service
public class UserService {

	@Autowired
	public UserDAO userDAO;
	
	public List<User> getList(){
		return userDAO.getUserList();
		
	}
	
}
