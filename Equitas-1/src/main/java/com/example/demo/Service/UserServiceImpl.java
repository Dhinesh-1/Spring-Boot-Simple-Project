package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.User;
import com.example.demo.UserRepository;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;


	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}



	
	public User fetchDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
	
	
	

}
