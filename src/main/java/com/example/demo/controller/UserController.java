package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.implementation.UserServiceImplementation;

@RestController
public class UserController {

	@Autowired
	private UserServiceImplementation service;

	//API: http://localhost:8085/get-all-users, UseCase: To get list of carscan users 
	@GetMapping("get-all-users")
	public ResponseEntity<ArrayList<User>> getAllUsers() {
		return new ResponseEntity<ArrayList<User>>(service.getAllUsers(),HttpStatus.OK);
	}

	//API : http://localhost:8085/save-user, UseCase: To save a user in DB if not exists.
	@PostMapping("save-user")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		return new ResponseEntity<String>(service.saveUser(user),HttpStatus.OK);
	}

	//API : http://localhost:8085/update-user, UseCase: To update a user in DB if exists.
	@PutMapping("update-user")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		return new ResponseEntity<String>(service.updateUser(user),HttpStatus.OK);
	}

	//API : http://localhost:8085/delete-user, UseCase: To delete a user in DB if exists.
	@DeleteMapping("delete-user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id) {
		return new ResponseEntity<String>(service.deleteUser(id),HttpStatus.OK);
	}
}
