package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place2;
import com.example.demo.service.place2service;

@RestController
@RequestMapping("/api/v1")
public class place2controller {
	@Autowired place2service service;
	
	@PostMapping("/placeslist/place2")
	public String addPlace(@RequestBody List<place2>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place2")
	public List<place2>  getPlace(){
		return service.getPlace();
	}

}