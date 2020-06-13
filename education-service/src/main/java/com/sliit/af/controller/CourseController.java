package com.sliit.af.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.af.model.Course;
import com.sliit.af.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	/**
	 * insert new course
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/courses", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> registerUser(@RequestBody Course course) {
		try {
			return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * get all registered user
	 * 
	 * @return
	 */
	@GetMapping("/courses")
	public ResponseEntity<?> getAllUsers() {
		try {
			return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
