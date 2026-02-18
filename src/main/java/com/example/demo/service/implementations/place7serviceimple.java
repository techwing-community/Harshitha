package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place7;
import com.example.demo.repository.place7repository;
import com.example.demo.service.place7service;

@Service
public class place7serviceimple implements place7service{
	@Autowired place7repository repo;
	
	@Override
	public String addPlace(List<place7>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place7> getPlace() {
		return	repo.findAll();
	}

}