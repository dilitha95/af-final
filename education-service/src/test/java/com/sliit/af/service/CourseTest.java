package com.sliit.af.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sliit.af.model.Course;
import com.sliit.af.model.repository.CourseMaterialRepository;
import com.sliit.af.model.repository.CourseRepository;

@RunWith(SpringRunner.class)
public class CourseTest {

	@TestConfiguration
	static class CourseServiceTestContextConfiguration {
		@Bean
		public CourseService courseService() {
			return new CourseService();
		}
	}

	@Autowired
	CourseService courseService;

	@MockBean
	CourseRepository courseRepository;

	@MockBean
	CourseMaterialRepository courseMaterialRepository;

	@Before
	public void setUp() {

		Course course = new Course();
		course.setCourseName("Application Frameworks");
		course.setCourseNo("IT2020");
		course.setSemester("2");
		course.setYear("3");

		Mockito.when(courseRepository.findByCourseNo("IT2020")).thenReturn(course);

	}

	@Test
	public void findByCourseNumberTest() {

		Course course = courseService.findByCourseNo("IT2020");
		assertThat(course.getCourseName()).isSameAs("Application Frameworks");

	}

}
