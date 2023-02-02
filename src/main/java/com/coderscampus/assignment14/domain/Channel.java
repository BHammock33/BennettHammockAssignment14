package com.coderscampus.assignment14.domain;

public class Channel {
	
	private Long CId;
	private String name;
	
	public Long getCId() {
		return CId;
	}
	public void setCId(Long CId) {
		this.CId = CId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Channel [CId=" + CId + ", name=" + name + "]";
	}
	
	

}
