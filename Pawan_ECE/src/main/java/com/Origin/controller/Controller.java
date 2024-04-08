package com.Origin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Origin.model.User;
import com.Origin.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService serviceRequest;
	@PostMapping("/post")
	public User addRequest(@RequestBody User user)
	{
		return serviceRequest.addRequest(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllRequest()
	{
		return serviceRequest.addRequest();
	}
}
