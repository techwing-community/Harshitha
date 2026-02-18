package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place4;
import com.example.demo.repository.place4repository;
import com.example.demo.service.place4service;

@Service
public class place4serviceimple implements place4service{
	@Autowired place4repository repo;
	
	@Override
	public String addPlace(List<place4>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place4> getPlace() {
		return	repo.findAll();
	}

}