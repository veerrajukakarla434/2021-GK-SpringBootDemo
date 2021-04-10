package com.gk.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gk.spring.demo.model.Employee;
import com.gk.spring.demo.service.IEmployee;

@RestController
public class EmployeeController {

	@Autowired        // Spting IOC : inversion of control 
	IEmployee emplooyeeService;

	@GetMapping(value = "/employee/{id}")
	public ResponseEntity<Object> getEmployee(@PathVariable int id) {

		Employee emp = emplooyeeService.getEmployee(id);

		return new ResponseEntity<Object>(emp, HttpStatus.OK);
	}

	@GetMapping(value = "/employee/getemp/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {

		Employee emp = emplooyeeService.getEmployee(empId);

		return emp;
	}

}
