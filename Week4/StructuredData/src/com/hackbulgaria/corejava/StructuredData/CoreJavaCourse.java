package com.hackbulgaria.corejava.StructuredData;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
//jcodec
//xuggler

@XmlRootElement
public class CoreJavaCourse {
	@XmlElement(name = "student")
	@XmlElementWrapper(name = "students")
	private final List<Student> enrolledStudents = new ArrayList<>();
	@XmlElement
	private final int courseId;
	@XmlElement
	private final String courseName;

	public CoreJavaCourse() {
		this.courseId = 0;
		this.courseName = "Kyrs";
	}

	public void add(Student student) {
		enrolledStudents.add(student);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}