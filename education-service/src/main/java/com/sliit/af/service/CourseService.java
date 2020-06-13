package com.sliit.af.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sliit.af.model.Course;
import com.sliit.af.model.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	public Course save(Course course) {
		return courseRepository.save(course);
	}

}
