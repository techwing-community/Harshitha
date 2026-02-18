package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place5;
import com.example.demo.service.place5service;

@RestController
@RequestMapping("/api/v1")
public class place5controller {
	@Autowired place5service service;
	
	@PostMapping("/placeslist/place5")
	public String addPlace(@RequestBody List<place5>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place5")
	public List<place5>  getPlace(){
		return service.getPlace();
	}

}