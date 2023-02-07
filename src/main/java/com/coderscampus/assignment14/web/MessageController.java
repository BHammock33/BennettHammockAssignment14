package com.coderscampus.assignment14.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment14.domain.Message;
import com.coderscampus.assignment14.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/messages/{CId}")
	public List<Message> getMessages(@PathVariable Long CId){
		List<Message> messages = messageService.getMessages(CId);
		//System.out.println(messages);
		return messages;
	}
	@PostMapping("/messages")
	public Message postMessages(@RequestBody Message message) {
	//	System.out.println(message);
		if(message.getUser() != null) {
			messageService.saveMessage(message);
		}
		return message;
	}
	

}
