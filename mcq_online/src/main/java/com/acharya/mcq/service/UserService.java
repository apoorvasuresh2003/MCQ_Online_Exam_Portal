package com.acharya.mcq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acharya.mcq.model.User;

@Service
public interface UserService {
	
	User addUser(User user);

	List<User> listAllUsers();

}
