package com.sliit.af.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sliit.af.model.CourseMaterial;
import com.sliit.af.model.repository.CourseMaterialRepository;

@Service
public class CourseMaterialService {

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;

	public CourseMaterial save(CourseMaterial courseMaterial) {
		return courseMaterialRepository.save(courseMaterial);
	}

	public List<CourseMaterial> findByCourseNo(String courseNo) {
		return courseMaterialRepository.findByCourseNo(courseNo);
	}

}
