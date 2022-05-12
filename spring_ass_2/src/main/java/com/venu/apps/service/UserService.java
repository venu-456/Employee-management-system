package com.venu.apps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venu.apps.entity.User;
import com.venu.apps.exception.ResourceNotFoundException;
import com.venu.apps.repo.UserRepo;


@Service
public class UserService {
	@Autowired
	private UserRepo repository ;
	
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	public List<User> saveUsers(List<User> users) {
		return repository.saveAll(users);
	}
	public List<User> getUsers(){
		return repository.findAll();
	}
	public User getUserById(int id){
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not exist with id:"+id));
	}
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "user removed!! "+id;
	}
	
	
	public User updateUser(User user) {
		User existingUser =repository.findById(user.getId()).orElseThrow(() -> new ResourceNotFoundException("user not exist with id:"+user.getId()));
		existingUser.setUser_name(user.getUser_name());
		existingUser.setUser_address(user.getUser_address());
		existingUser.setUser_contact(user.getUser_contact());
		return repository.save(existingUser);
	}
}
