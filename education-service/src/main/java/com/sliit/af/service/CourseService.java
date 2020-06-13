package com.sliit.af.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sliit.af.model.Course;
import com.sliit.af.model.CourseMaterial;
import com.sliit.af.model.repository.CourseMaterialRepository;
import com.sliit.af.model.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;

	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	public Course save(Course course) {
		return courseRepository.save(course);
	}

	public List<CourseMaterial> getCourseMaterials(String courseNo) {
		return courseMaterialRepository.findByCourseNo(courseNo);
	}

}
