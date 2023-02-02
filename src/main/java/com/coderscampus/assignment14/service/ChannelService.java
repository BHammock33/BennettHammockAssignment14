package com.coderscampus.assignment14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.repository.ChannelRepository;

@Component
public class ChannelService {

	@Autowired
	private ChannelRepository channelRepo;
	
	public List<Channel> findAll(){
		List<Channel> channels = channelRepo.findAll();
		return channels;
	}
	
	public Channel findByCId(Long CId) {
		Channel channel = channelRepo.findByCId(CId);
		return channel;
		
	}
	
	public Channel saveChannel(String channelName) {
		return channelRepo.save(channelName);
	}
}
