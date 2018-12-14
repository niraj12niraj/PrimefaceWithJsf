package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {
	
	public void getUserById(int id);
	public void saveUser(User user);
	public List<User>getUserList();
	public User updateOrEditUser(User user);
	public void mergerUser(User user);

}
