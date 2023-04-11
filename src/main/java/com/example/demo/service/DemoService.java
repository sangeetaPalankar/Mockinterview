package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;

@Service
public interface DemoService {

	List<Demo> findAllData();

}
