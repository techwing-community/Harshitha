package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place2;
import com.example.demo.repository.place2repository;
import com.example.demo.service.place2service;

@Service
public class place2serviceimple implements place2service {
	@Autowired place2repository repo;
	
	@Override
	public String addPlace(List<place2>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place2> getPlace() {
		return	repo.findAll();
	}
}



