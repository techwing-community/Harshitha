package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.place6;
import com.example.demo.service.place6service;

@RestController
@RequestMapping("/api/v1")
public class place6controller {
	@Autowired place6service service;
	
	@PostMapping("/placeslist/place6")
	public String addPlace(@RequestBody List<place6>  i){
		return service.addPlace(i);
	}
	
	@GetMapping("/place6")
	public List<place6>  getPlace(){
		return service.getPlace();
	}

}