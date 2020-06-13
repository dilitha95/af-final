package com.sliit.af.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sliit.af.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findByItno(String itno);

	public User findByItnoAndPassword(String itno, String password);

}
