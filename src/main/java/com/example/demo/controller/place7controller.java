package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place7;
import com.example.demo.service.place7service;

@RestController
@RequestMapping("/api/v1")
public class place7controller {
	@Autowired place7service service;
	
	@PostMapping("/placeslist/place7")
	public String addPlace(@RequestBody List<place7>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place7")
	public List<place7>  getPlace(){
		return service.getPlace();
	}

}