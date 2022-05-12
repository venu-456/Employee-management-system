package com.team.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.app.exception.ResourceNotFoundException;
import com.team.app.model.Employee;
import com.team.app.repository.EmployeeRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	@Autowired
	private EmployeeRepository Emp_repo;
	@GetMapping
	public List<Employee> getAllEmployees(){
		return Emp_repo.findAll();
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee){
		return Emp_repo.save(employee);
	}
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
		Employee emp =Emp_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
		return ResponseEntity.ok(emp);
	}

	@PutMapping( "{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee emp_details){
		Employee update_emp=Emp_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
		update_emp.setFirstName(emp_details.getFirstName()); 
		update_emp.setLastName(emp_details.getLastName());
		update_emp.setEmailId(emp_details.getEmailId());
		Emp_repo.save(update_emp);
		return ResponseEntity.ok(update_emp);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int id){
		Employee emp = Emp_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
		Emp_repo.delete(emp);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

