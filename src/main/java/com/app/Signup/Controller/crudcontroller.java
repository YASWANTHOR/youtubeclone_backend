package com.app.Signup.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Signup.model.video;
import com.app.Signup.service.crudservice;


@RestController
public class crudcontroller {
	@Autowired
	private crudservice service;
	
	
	@GetMapping("/getvideolist")
	@CrossOrigin(origins="http://localhost:4200")
	public List<video> fetchVideoList(){
List<video> videos= new ArrayList<video>();
		
	   videos=service.fetchvideoList();
		return videos;
		
	}
	@PostMapping("/addvideo")
	public video saveVideo(@RequestBody video Video) {
		
		return service.saveVideoToDB(Video);
		
		
		
		
	}
	
	@GetMapping("/getvideobyid/{id}")
	public video fetchVideoById(@PathVariable int id){
		
		return service.fetchVideoById(id).get();

		
	}
	@DeleteMapping("/deletevideobyid/{id}")
	public String DeleteVideoById(@PathVariable int id) {
		
		return service.deleteVideoById(id);
		
		
		
		
	}
	
}
