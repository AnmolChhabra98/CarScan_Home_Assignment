package com.example.demo.service.implementation;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired 
	private UserRepository userRepo;

	//getting all users from repository and converting to a list.
	@Override
	public ArrayList<User> getAllUsers() {
		return (ArrayList<User>) userRepo.findAll();
	}

	//save a user in database if user doesn't exists.
	@Override
	public String saveUser(User user) {
		if(userRepo.existsById(user.getMobileNumber())) {
			return user.getFname()+ " data already exists.";
		}else {
			userRepo.save(user);
			return user.getFname()+ " data saved successfully.";
		}
	}

	//update a user in database if exists.
	@Override
	public String updateUser(User user) {
		if(userRepo.existsById(user.getMobileNumber())) {
			userRepo.save(user);
			return user.getFname()+ " data updated successfully.";
		}else {
			return "No such user exists.";
		}
	}

	//delete a user from database if exists.
	@Override
	public String deleteUser(String id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			String name = user.get().getFname();
			userRepo.deleteById(id);
			return name+ " user data deleted successfully.";	
		}else {
			return "No such user exists.";
		}
	}
}
