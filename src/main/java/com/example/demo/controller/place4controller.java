package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place4;
import com.example.demo.service.place4service;

@RestController
@RequestMapping("/api/v1")
public class place4controller {
	@Autowired place4service service;
	
	@PostMapping("/placeslist/place4")
	public String addPlace(@RequestBody List<place4>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place4")
	public List<place4>  getPlace(){
		return service.getPlace();
	}

}