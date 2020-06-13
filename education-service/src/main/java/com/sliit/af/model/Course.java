package com.sliit.af.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {

	@Id
	public String id;

	private String courseNo;

	private String courseName;

	private String year;

	private String semester;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the courseNo
	 */
	public String getCourseNo() {
		return courseNo;
	}

	/**
	 * @param courseNo the courseNo to set
	 */
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseNo=" + courseNo + ", courseName=" + courseName + ", year=" + year
				+ ", semester=" + semester + "]";
	}

}
