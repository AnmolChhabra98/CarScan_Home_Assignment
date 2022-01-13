package com.example.demo.service.implementation;

import java.util.ArrayList;

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

	//save a user to database
	@Override
	public String saveUser(User user) {
		if(userRepo.existsById(user.getMobileNumber())) {
			return user.getFname()+ " data already exists.";
		}else {
			userRepo.save(user);
			return user.getFname()+ " data saved successfully.";
		}
	}

	//update a user in database
	@Override
	public String updateUser(User user) {
		userRepo.save(user);
		return user.getFname()+ " info updated successfully.";
	}

	//delete a user from database
	@Override
	public String deleteUser(User user) {
		userRepo.delete(user);
		return user.getFname()+ " info deleted successfully.";
	}
}
