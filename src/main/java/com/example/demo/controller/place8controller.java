package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place8;
import com.example.demo.service.place8service;

@RestController
@RequestMapping("/api/v1")
public class place8controller {
	@Autowired place8service service;
	
	@PostMapping("/placeslist/place8")
	public String addPlace(@RequestBody List<place8>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place8")
	public List<place8>  getPlace(){
		return service.getPlace();
	}

}