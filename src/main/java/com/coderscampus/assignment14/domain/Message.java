package com.coderscampus.assignment14.domain;

public class Message {
	
	private String text;
	private User user;
	private Long MId;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getMId() {
		return MId;
	}
	public void setMId(Long MId) {
		this.MId = MId;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + ", user=" + user + ", MId=" + MId + "]";
	}
	
	

}
