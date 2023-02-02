package com.coderscampus.assignment14.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.coderscampus.assignment14.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository userRepo;

}
