package com.sliit.af.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.af.model.Course;
import com.sliit.af.model.CourseMaterial;
import com.sliit.af.service.CourseMaterialService;
import com.sliit.af.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private CourseMaterialService courseMaterialService;

	/**
	 * insert new course
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/courses", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> addCourse(@RequestBody Course course) {
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
	public ResponseEntity<?> getAllCourses() {
		try {
			return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * add a new course material
	 * 
	 * @return
	 */
	@PostMapping("/materials")
	public ResponseEntity<?> addCourseMaterials(@RequestBody CourseMaterial courseMaterial) {
		try {
			return new ResponseEntity<>(courseMaterialService.save(courseMaterial), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * get all registered user
	 * 
	 * @return
	 */
	@GetMapping("/courses/{courseNo}/materials")
	public ResponseEntity<?> getCourseMaterials(@PathVariable("courseNo") String courseNo) {
		try {
			return new ResponseEntity<>(courseService.getCourseMaterials(courseNo), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
