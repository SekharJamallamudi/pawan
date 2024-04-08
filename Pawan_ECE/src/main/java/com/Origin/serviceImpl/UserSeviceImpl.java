package com.Origin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Origin.model.User;
import com.Origin.repository.UserRepository;
import com.Origin.service.UserService;

@org.springframework.stereotype.Service
public class UserSeviceImpl implements UserService {
      @Autowired
      private UserRepository userRepository;
	@Override
	public User addRequest(User user) {
		return userRepository.save(user);
	}
	@Override
	public List<User> addRequest() {
		
		return userRepository.findAll();
	}

}
