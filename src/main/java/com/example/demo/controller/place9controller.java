package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place9;
import com.example.demo.service.place9service;

@RestController
@RequestMapping("/api/v1")
public class place9controller {
	@Autowired place9service service;
	
	@PostMapping("/placeslist/place9")
	public String addPlace(@RequestBody List<place9>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place9")
	public List<place9>  getPlace(){
		return service.getPlace();
	}

}