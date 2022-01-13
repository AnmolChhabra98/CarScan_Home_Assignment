package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.User;

public interface UserService {
	
	//These are the only methods, which must be implemented from Service layer.
	
	ArrayList<User> getAllUsers();
	String saveUser(User user);
	String updateUser(User user);
	String deleteUser(String id);
}
