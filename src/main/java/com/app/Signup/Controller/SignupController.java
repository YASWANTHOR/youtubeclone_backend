package com.app.Signup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Signup.model.User;
import com.app.Signup.service.Signupservice;

@RestController
public class SignupController {
	
	
	@Autowired
	private Signupservice service;
	
	@PostMapping("/signupuser")
	@CrossOrigin(origins="http://localhost:4200")
	public User signupUser(@RequestBody User user) throws Exception {
		String tempEmailid=user.getEmailid();
		if(tempEmailid!=null && !"".equals(tempEmailid)) {
			User userobj=service.fetchUserByEmailid(tempEmailid);
			if(userobj!=null) {
				throw new Exception("user with "+tempEmailid+" is already exist" );
			}
		}
		
		User userObj=null;
		
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailid= user.getEmailid();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempEmailid!=null && tempPass !=null) {
			userObj=service.fetchUserByEmailidAndPassword(tempEmailid,tempPass );
		}
		if(userObj==null) {
			throw new Exception("Bad Crendential");		}
		
		return userObj;
	}
	  
	
	
	

}
