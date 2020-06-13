package com.sliit.af.model.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sliit.af.model.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends MongoRepository<CourseMaterial, String> {

	public List<CourseMaterial> findByCourseNo(String courseNo);

}
