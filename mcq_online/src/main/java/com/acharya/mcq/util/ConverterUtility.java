package com.acharya.mcq.util;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.acharya.mcq.data.model.Users;
import com.acharya.mcq.model.User;


@Service
public class ConverterUtility {

	Logger LOGGER = LoggerFactory.getLogger(ConverterUtility.class);
	
    @Autowired
    private ModelMapper modelMapper;
	
	public Users convertToDto(User user) {
		LOGGER.debug(user.toString());
		Users userDto = modelMapper.map(user, Users.class);
		return userDto;
		
	}
	
	public User convertToModel(Users users) {
		LOGGER.debug(users.toString());
		return modelMapper.map(users, User.class);
	}

}
