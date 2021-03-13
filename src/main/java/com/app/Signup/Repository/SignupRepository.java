package com.app.Signup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Signup.model.User;

public interface SignupRepository extends JpaRepository<User, Integer>{
	
	public User findByEmailid(String emailid);
	public User findUserByEmailidAndPassword(String email,String password);

}
