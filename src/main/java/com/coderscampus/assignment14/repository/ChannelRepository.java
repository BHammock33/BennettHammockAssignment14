package com.coderscampus.assignment14.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.coderscampus.assignment14.domain.Channel;

@Repository
public class ChannelRepository {

	private List<Channel> channels = new ArrayList<>();
	

	public List<Channel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public Channel findByCId(Long CId) {
		Channel channel = new Channel();
		return channel;
	}



	public Channel save(String channelName) {
		Channel channel = new Channel();
		channel.setName(channelName);
		channels.add(channel);
		channel.setCId((long) channels.size());
		return channel;
	}






}
