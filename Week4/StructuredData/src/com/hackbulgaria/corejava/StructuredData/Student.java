package com.hackbulgaria.corejava.StructuredData;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	@XmlElement
	private final int studentId;
	@XmlElement
	private final String name;

	public Student() {
		this.studentId = 1;
		this.name = "Rosen";
	}
}
