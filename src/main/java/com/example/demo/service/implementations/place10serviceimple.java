package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place10;
import com.example.demo.repository.place10repository;
import com.example.demo.service.place10service;

@Service
public class place10serviceimple implements place10service{
	@Autowired place10repository repo;
	
	@Override
	public String addPlace(List<place10>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place10> getPlace() {
		return	repo.findAll();
	}

}