package com.codedecode.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeCrudRepo;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	
	@Autowired
	EmployeeCrudRepo empCurd;
	
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		System.out.println("Getting all employees");
		return empCurd.findAll();
	}

}
