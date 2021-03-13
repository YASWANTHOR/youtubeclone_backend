package com.app.Signup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Signup.Repository.crudrepository;
import com.app.Signup.model.video;




@Service
public class crudservice {
	
	@Autowired
	private crudrepository repository;
	public List<video> fetchvideoList(){
		
		return repository.findAll();
		
		
	}
	
	public video saveVideoToDB(video Video) {
		
		return repository.save(Video);
	}
	
    public Optional<video> fetchVideoById(int id) {
		
		return repository.findById(id);
	}
    public String deleteVideoById(int id) {
    	
    	String result;
    	try {
    		
    	repository.deleteById(id);
    	result="video succesfully deleted";
    	
    	} catch(Exception e) {
    		result="video with id is not deleted";
    	}
    	return result;
	}
    


    }
