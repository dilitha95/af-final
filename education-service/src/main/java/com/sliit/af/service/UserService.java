package com.sliit.af.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sliit.af.model.User;
import com.sliit.af.model.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findByItnoAndPassword(String itno, String password) {
		return userRepository.findByItnoAndPassword(itno, password);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		user.setRegDate(System.nanoTime());
		return userRepository.save(user);
	}

}
