package com.sliit.af.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CourseMaterial {

	@Id
	public String id;

	private String courseNo;

	private String displayName;

	/**
	 * video, pdf, txt
	 */
	private String materialType;

	private String materialDownloadUrl;

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
	 * @return the materialType
	 */
	public String getMaterialType() {
		return materialType;
	}

	/**
	 * @param materialType the materialType to set
	 */
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the materialDownloadUrl
	 */
	public String getMaterialDownloadUrl() {
		return materialDownloadUrl;
	}

	/**
	 * @param materialDownloadUrl the materialDownloadUrl to set
	 */
	public void setMaterialDownloadUrl(String materialDownloadUrl) {
		this.materialDownloadUrl = materialDownloadUrl;
	}

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", courseNo=" + courseNo + ", displayName=" + displayName
				+ ", materialType=" + materialType + ", materialDownloadUrl=" + materialDownloadUrl + "]";
	}

}
