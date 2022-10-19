package com.example.democrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrud.model.User;
import com.example.democrud.service.api.UserServiceAPI;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class UserRestController {

	@Autowired
	private UserServiceAPI userServiceAPI;

	@GetMapping(value = "/all")
	public List<User> getAll() {
		return userServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public User find(@PathVariable Long id) {
		return userServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<User> save(@RequestBody @Valid User user) {
		User obj = userServiceAPI.save(user);
		return new ResponseEntity<User>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id) {
		User user = userServiceAPI.get(id);
		if (user != null) {
			userServiceAPI.delete(id);
		} else {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
