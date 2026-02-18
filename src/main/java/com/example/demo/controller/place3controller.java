package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place3;
import com.example.demo.service.place3service;

@RestController
@RequestMapping("/api/v1")
public class place3controller {
	@Autowired place3service service;
	
	@PostMapping("/placeslist/place3")
	public String addPlace(@RequestBody List<place3>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place3")
	public List<place3>  getPlace(){
		return service.getPlace();
	}

}