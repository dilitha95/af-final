package com.sliit.af.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.af.model.User;
import com.sliit.af.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * insert new user
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/register", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> registerUser(@RequestBody User user) {
		try {
			return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * user login
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/login", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> userLogin(@RequestBody User user) {
		try {
			User student = userService.findByItnoAndPassword(user.getItno(), user.getPassword());
			if (Objects.nonNull(student)) {
				return new ResponseEntity<>(student, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("{\"message\": \"Invalid username or password\"}", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * get all registered user
	 * 
	 * @return
	 */
	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {
		try {
			return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
