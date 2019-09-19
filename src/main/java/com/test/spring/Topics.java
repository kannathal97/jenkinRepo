package com.test.spring;
public class Topics {

	private String courseId;
	public String getCourseId() {
		return courseId;
	}
	public Topics(String courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Topics() {
		
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	private String courseName;
}
