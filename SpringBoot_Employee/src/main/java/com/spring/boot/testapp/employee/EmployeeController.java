package com.spring.boot.testapp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();

	}

	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee emp ) {
		empService.addEmployee(emp);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable String id ) {
		empService.updateEmployee(emp,id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee(@PathVariable String id ) {
		empService.deleteEmployee(id);
		
	}
	
	
}


