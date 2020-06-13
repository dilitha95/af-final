package com.sliit.af.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sliit.af.model.Course;
import com.sliit.af.model.User;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

	public User findByCourseNo(String courseNo);

}
