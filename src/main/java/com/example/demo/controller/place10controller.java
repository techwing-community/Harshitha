package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place10;
import com.example.demo.service.place10service;

@RestController
@RequestMapping("/api/v1")
public class place10controller {
	@Autowired place10service service;
	
	@PostMapping("/placeslist/place10")
	public String addPlace(@RequestBody List<place10>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place10")
	public List<place10>  getPlace(){
		return service.getPlace();
	}

}