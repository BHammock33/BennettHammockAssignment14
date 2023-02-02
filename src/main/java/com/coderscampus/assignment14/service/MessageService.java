package com.coderscampus.assignment14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderscampus.assignment14.repository.MessageRepository;

@Component
public class MessageService {

	@Autowired
	private MessageRepository messageRepo;
}
