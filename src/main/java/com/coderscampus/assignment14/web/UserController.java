package com.coderscampus.assignment14.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.coderscampus.assignment14.service.ChannelService;
import com.coderscampus.assignment14.service.MessageService;
import com.coderscampus.assignment14.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private MessageService messageService;
	@Autowired
	private ChannelService channelService;
	
	

}
