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

import com.sliit.af.model.CourseMaterial;
import com.sliit.af.model.repository.CourseMaterialRepository;

@RunWith(SpringRunner.class)
public class CourseMaterialTest {

	@TestConfiguration
	static class CourseMmaterialServiceTestContextConfiguration {
		@Bean
		public CourseMaterialService courseMaterialService() {
			return new CourseMaterialService();
		}
	}

	@MockBean
	CourseMaterialRepository courseMaterialRepository;

	@Autowired
	CourseMaterialService courseMaterialService;

	@Before
	public void setUp() {

		CourseMaterial courseMaterial = new CourseMaterial();
		courseMaterial.setCourseNo("IT2020");
		courseMaterial.setDisplayName("Lecture 01 - video");
		courseMaterial.setMaterialDownloadUrl("http://videourl.com/123");
		courseMaterial.setMaterialType("video");

		List<CourseMaterial> cm = new ArrayList<>();
		cm.add(courseMaterial);

		Mockito.when(courseMaterialRepository.findByCourseNo("IT2020")).thenReturn(cm);

	}

	@Test
	public void findByCourseNumberTest() {

		List<CourseMaterial> cm = courseMaterialService.findByCourseNo("IT2020");
		assertThat(cm.get(0).getDisplayName()).isSameAs("Lecture 01 - video");

	}

}
