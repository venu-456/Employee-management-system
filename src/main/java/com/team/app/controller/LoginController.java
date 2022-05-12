package com.team.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.team.app.exception.ResourceNotFoundException;
import com.team.app.model.Login;
import com.team.app.repository.LoginRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/login")
public class LoginController {
	@Autowired
	private LoginRepository Log_repo;
	@GetMapping
	public List<Login> getAllEmployees(){
		return Log_repo.findAll();
	}
	@PostMapping
	public Login createEmployee(@RequestBody Login log){
		return Log_repo.save(log);
	}
	@GetMapping("{id}")
	public ResponseEntity<Login> getLoginById(@PathVariable int id){
		Login log =Log_repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
		return ResponseEntity.ok(log);
	}
	@GetMapping("/user/{User}")
	public ResponseEntity<Login> getLoginByName(@PathVariable String User){
		Login log =Log_repo.findByUserName(User).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+User));
		return ResponseEntity.ok(log);
	}
	@PutMapping
	public ResponseEntity<Login> reset(@RequestBody Login log) {
		Login Update_log=Log_repo.findByUserName(log.getUserName()).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with name:"+log.getUserName()));
		Update_log.setPassword(log.getPassword());
		Log_repo.save(Update_log);
		return ResponseEntity.ok(Update_log);
	}
}
