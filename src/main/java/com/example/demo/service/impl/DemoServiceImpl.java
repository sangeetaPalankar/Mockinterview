package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl {
	
	private DemoRepository demorepo;
	
	public List<Demo> findAllData(){
		return demorepo.findAll();
	}

}
