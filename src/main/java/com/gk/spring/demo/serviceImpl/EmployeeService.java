package com.gk.spring.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.gk.spring.demo.model.Employee;
import com.gk.spring.demo.service.IEmployee;

@Service
public class EmployeeService implements IEmployee {

	@Override
	public Employee getEmployee(int id) {
		
		Employee employee = new Employee();
		
		employee.setId(id);
		employee.setName("Girish");
		employee.setAddr("US");
		
		return employee;
	}

}
