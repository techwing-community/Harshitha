package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place1;
import com.example.demo.repository.place1repository;
import com.example.demo.service.place1service;

@Service
public class place1serviceimple implements place1service {
	@Autowired place1repository repo;
	
	@Override
	public String addPlace(List<place1>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place1> getPlace() {
		return	repo.findAll();
	}
}



