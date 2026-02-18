package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place9;
import com.example.demo.repository.place9repository;
import com.example.demo.service.place9service;

@Service
public class place9serviceimple implements place9service{
	@Autowired place9repository repo;
	
	@Override
	public String addPlace(List<place9>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place9> getPlace() {
		return	repo.findAll();
	}

}