package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place5;
import com.example.demo.repository.place5repository;
import com.example.demo.service.place5service;

@Service
public class place5serviceimple implements place5service{
	@Autowired place5repository repo;
	
	@Override
	public String addPlace(List<place5>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place5> getPlace() {
		return	repo.findAll();
	}

}