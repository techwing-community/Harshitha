package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place8;
import com.example.demo.repository.place8repository;
import com.example.demo.service.place8service;

@Service
public class place8serviceimple implements place8service{
	@Autowired place8repository repo;
	
	@Override
	public String addPlace(List<place8>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place8> getPlace() {
		return	repo.findAll();
	}

}