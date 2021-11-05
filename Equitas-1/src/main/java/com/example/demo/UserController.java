package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import java.lang.Math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/bit_ly")
	public User saveUser(@RequestBody User user) {
		int min=100;
		int max=900;
		int a=(int)(Math.random()*(max-min+1)+min);
		user.setAccCvv(a);
		
		long min1=10000000;
		long max1=99999999;
		long b=(long)(Math.random()*(max1-min1)+min1);
		user.setAccNo(b);
		return userService.saveUser(user);
	}
	
	@GetMapping("/bit_ly/{id}")
	public User fetchUserById(@PathVariable("id")Long Id) {
		return userService.fetchDepartmentById(Id);
	}
	

}
