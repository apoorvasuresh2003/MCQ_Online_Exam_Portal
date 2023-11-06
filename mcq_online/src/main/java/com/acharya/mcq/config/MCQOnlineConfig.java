package com.acharya.mcq.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.acharya.mcq.impl.UserServiceImpl;
import com.acharya.mcq.service.UserService;

@Configuration
public class MCQOnlineConfig {
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}

}
