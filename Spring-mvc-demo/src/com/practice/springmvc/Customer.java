package com.practice.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.practice.springmvc.validation.CourseCode;

public class Customer {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	@NotNull(message = "is required")
	@Max(value = 10, message = "Max value cannot exceed 10")
	@Min(value = 1, message = "Min value cannot be less than 1")
	private Integer freePasses;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Passcode should be of length 5(char/int)")
	private String passCode;

	@CourseCode(value = { "MUK", "SUK" }, message = "code should start with either MUK or SUK")
	private String courseCode;

	public String getPassCode() {
		return passCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

}
