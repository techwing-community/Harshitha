package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place1;
import com.example.demo.service.place1service;

@RestController
@RequestMapping("/api/v1")
public class place1controller {
	@Autowired place1service service;
	
	@PostMapping("/placeslist/place1")
	public String addPlace(@RequestBody List<place1>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place1") 
	public List<place1>  getPlace(){
		return service.getPlace();
	}

}