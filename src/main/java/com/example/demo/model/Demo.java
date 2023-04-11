package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="User")
public class Demo {
	
	@Id
	@Column
	private int Id;
	
	@Column
	private String name;
	

}
