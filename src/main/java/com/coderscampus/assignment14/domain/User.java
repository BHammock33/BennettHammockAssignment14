package com.coderscampus.assignment14.domain;

import java.util.ArrayList;
import java.util.List;



public class User {
	
	private Long UId;
	private String Name;
	private List<Message> messages = new ArrayList<>();
	private List<Channel> channels = new ArrayList<>();
	
	public Long getUId() {
		return UId;
	}
	public void setId(Long UId) {
		this.UId = UId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	@Override
	public String toString() {
		return "User [UId=" + UId + ", Name=" + Name + ", messages=" + messages + ", channels=" + channels + "]";
	}
	
	
	
	
	

}
