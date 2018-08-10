package com.spring.boot.testapp.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee() {
	List<Employee> employees = new ArrayList<>();
	empRepo.findAll().forEach(employees::add);
	return employees;
	}


	public void addEmployee(Employee emp) {
		empRepo.save(emp);

	}

	public void updateEmployee(Employee emp, String id) {
		empRepo.save(emp);
		
	}

	public void deleteEmployee(String id) {
		empRepo.deleteById(id);

	}
}
