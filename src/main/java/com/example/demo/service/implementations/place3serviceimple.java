package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place3;
import com.example.demo.repository.place3repository;
import com.example.demo.service.place3service;

@Service
public class place3serviceimple implements place3service{
	@Autowired place3repository repo;
	
	@Override
	public String addPlace(List<place3>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place3> getPlace() {
		return	repo.findAll();
	}

}