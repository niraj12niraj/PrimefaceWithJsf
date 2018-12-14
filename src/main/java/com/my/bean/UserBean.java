package com.my.bean;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.user.entity.Bank;
import com.user.entity.User;
import com.user.service.UserService;

@Configuration
@Scope("view")
public class UserBean {
	
	@Autowired
	private User user;
	@Autowired
	private UserService userService;
	private String masg;
	private List<User>uList;
	private List<Bank>bList;
	
	@PostConstruct
	public void init() {
		
	}
	
	public void registration() {
	 try {
	 userService.saveUser(user);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getMasg() {
		return masg;
	}

	public void setMasg(String masg) {
		this.masg = masg;
	}

	public List<User> getuList() {
		return uList;
	}

	public void setuList(List<User> uList) {
		this.uList = uList;
	}

	public List<Bank> getbList() {
		return bList;
	}

	public void setbList(List<Bank> bList) {
		this.bList = bList;
	}
	
	
	

}
