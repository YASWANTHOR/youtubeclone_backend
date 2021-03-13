package com.app.Signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Signup.Repository.SignupRepository;
import com.app.Signup.model.User;

@Service
public class Signupservice {
	
	@Autowired
	private SignupRepository repo;
	public User saveUser(User user) {
		
		return repo.save(user);
		
	}
	
	public User fetchUserByEmailid(String email) {
	
		 return repo.findByEmailid(email);
	}
	
	public User fetchUserByEmailidAndPassword(String email,String password) {
		
		 return repo.findUserByEmailidAndPassword(email, password);
	}

	

}
