package com.sliit.af.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	public String id;

	private String itno;

	private String name;

	private String password;

	private String email;

	private String mobileNo;

	private long regDate;

	/**
	 * @return the itno
	 */
	public String getItno() {
		return itno;
	}

	/**
	 * @param itno the itno to set
	 */
	public void setItno(String itno) {
		this.itno = itno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the regDate
	 */
	public long getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(long regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [itno=" + itno + ", name=" + name + ", password=" + password + ", email=" + email + ", mobileNo="
				+ mobileNo + ", regDate=" + regDate + "]";
	}

}
