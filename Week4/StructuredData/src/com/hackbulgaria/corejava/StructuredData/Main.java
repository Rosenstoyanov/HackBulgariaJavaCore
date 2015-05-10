package com.hackbulgaria.corejava.StructuredData;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
	public static void main(String[] args) throws JAXBException, IOException {
		Student rosen = new Student();
		CoreJavaCourse course = new CoreJavaCourse();
		course.add(rosen);
		course.add(rosen);

		JAXBContext context = JAXBContext.newInstance(CoreJavaCourse.class,
				Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File file = new File("/tmp/course.xml");
		marshaller.marshal(course, file);

		Unmarshaller unmarshaller = context.createUnmarshaller();
	}
}
