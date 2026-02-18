package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.place6;
import com.example.demo.repository.place6repository;
import com.example.demo.service.place6service;

@Service
public class place6serviceimple implements place6service{
	@Autowired place6repository repo;
	
	@Override
	public String addPlace(List<place6>i) {
		repo.saveAll(i);
		return "Data added successfully";	
	}
	
	@Override
	public List<place6> getPlace() {
		return	repo.findAll();
	}

}