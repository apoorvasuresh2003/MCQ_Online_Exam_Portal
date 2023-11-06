package com.acharya.mcq.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.acharya.mcq.data.model.Authorities;
import com.acharya.mcq.data.model.Users;
import com.acharya.mcq.data.repository.AuthoritiesRepository;
import com.acharya.mcq.data.repository.UsersRepository;
import com.acharya.mcq.model.User;
import com.acharya.mcq.service.UserService;
import com.acharya.mcq.util.ConverterUtility;

public class UserServiceImpl implements UserService {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private AuthoritiesRepository authoritiesRepository;

	@Autowired
	private ConverterUtility converterUtility;

	@Override
	public User addUser(User user) {

		Optional<Users> oUser = usersRepository.findById(user.getUsername());

		if (oUser.isPresent()) {
			throw new ResponseStatusException(
					HttpStatus.BAD_REQUEST, "User " + user.getUsername() + " already present.");
		}

		user.setEnabled(true);

		User addedUser = converterUtility.convertToModel(usersRepository.save(converterUtility.convertToDto(user)));

		Authorities authorities = new Authorities();
		authorities.setUsername(user.getUsername());
		authorities.setAuthority("ROLE_USER");

		authoritiesRepository.save(authorities);

		return addedUser;
	}

	@Override
	public List<User> listAllUsers() {
		Iterable<Users> users = usersRepository.findAll();
		List<User> response = new ArrayList<>();

		for (Users user : users) {
			response.add(converterUtility.convertToModel(user));
		}
		return response;
	}

}
