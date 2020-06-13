package com.sliit.af.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sliit.af.model.User;
import com.sliit.af.model.repository.UserRepository;

@RunWith(SpringRunner.class)
public class UserServiceTest {

	@TestConfiguration
	static class UserServiceTestContextConfiguration {
		@Bean
		public UserService userService() {
			return new UserService();
		}
	}

	@MockBean
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@Before
	public void setUp() {

		User user = new User();
		user.setEmail("dilitha@gmail.com");
		user.setItno("IT123123");
		user.setName("dilitha");
		user.setMobileNo("0777777777");
		user.setPassword("pAssWord");
		user.setRegDate(System.nanoTime());

		Mockito.when(userRepository.findByItnoAndPassword("IT123123", "pAssWord")).thenReturn(user);

		List<User> userList = new ArrayList<>();
		userList.add(user);

		Mockito.when(userRepository.findAll()).thenReturn(userList);

	}

	@Test
	public void findByItnoAndPasswordTest() {

		User user = userService.findByItnoAndPassword("IT123123", "pAssWord");
		assertThat(user.getName()).isSameAs("dilitha");

	}

	@Test
	public void findAllTest() {

		List<User> userList = userService.findAll();
		assertThat(userList.get(0).getName()).isSameAs("dilitha");

	}

}
