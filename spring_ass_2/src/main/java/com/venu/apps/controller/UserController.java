package com.venu.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.venu.apps.entity.User;

import com.venu.apps.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping("/adduser")
	public User addUserToDB(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("/addusers")
	public List<User> addUsers(@RequestBody List<User> users) {
		 return service.saveUsers(users); 
	}
	@GetMapping("/users")
	public List<User> findAllProducts(){
		return service.getUsers();
	}
	@GetMapping("user/{id}")
	public ResponseEntity<User> getEmployeeById(@PathVariable int id){
		User user = service.getUserById(id);
		return ResponseEntity.ok(user);
	}	
	@PutMapping("/update")
	public User updateProduct(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct_pathV (@PathVariable int id) {
		return service.deleteUser(id);
	}
	}
