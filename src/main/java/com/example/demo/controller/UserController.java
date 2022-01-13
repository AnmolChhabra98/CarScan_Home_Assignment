package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.implementation.UserServiceImplementation;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImplementation service;
	
	//API : http://localhost:8085/get-all-users
	@GetMapping("get-all-users")
	public ResponseEntity<ArrayList<User>> getAllUsers() {
		return new ResponseEntity<ArrayList<User>>(service.getAllUsers(),HttpStatus.OK);
	}
}
