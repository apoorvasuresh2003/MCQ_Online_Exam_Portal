package com.acharya.mcq.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.acharya.mcq.model.User;
import com.acharya.mcq.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> listAllUsers() {
		return userService.listAllUsers();
	}

	@PostMapping()
	public void addUser(User user, BindingResult result, Model model) {

		System.out.println(user.toString());

		if(user.getPassword().equals(user.getConfirmedPassword())){
			userService.addUser(user);

		} else {
			throw new ResponseStatusException(
				HttpStatus.BAD_REQUEST, "Password and confirmed password aren't same");
		}
	}
}
