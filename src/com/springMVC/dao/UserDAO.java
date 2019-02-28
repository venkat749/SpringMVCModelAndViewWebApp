package com.springMVC.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springMVC.model.User;

@Repository
public class UserDAO {

	@Autowired
	public User user;
	
	@Autowired
	public User userTWo;

	List<User> list = new ArrayList<User>();
	
	public List<User> getUserList() {
		
		user.setName("venkat");
		user.setEmail("venkat@gmail.com");
		user.setAge(23);
		user.setAddress("chidambaram");
		
		list.add(user);

		userTWo.setName("Poorani");
		userTWo.setEmail("poorani@gmail.com");
		userTWo.setAge(24);
		userTWo.setAddress("chennai");

		list.add(userTWo);
		return list;
	}

}
