package com.hackbulgaria.corejava;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUtilsTests {
	File testFile = new File("/home/rosen/workspace/Files/test/test.txt");
	String content = "Some text!";
	@Before
	public void setUp() throws Exception {
		testFile.createNewFile();
		FileWriter fw = new FileWriter(testFile.getAbsoluteFile());
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		bufferedWriter.write(content);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		fw.close();
		bufferedWriter.close();
	}

	@After
	public void tearDown() throws Exception {
		testFile.delete();
	}

	@Test
	public void testReadFromFile() throws IOException {
		assertEquals(content, FileUtils.readFrom(testFile));
	}

	@Test
	public void testReadFromPath() throws IOException {
		assertEquals(content, FileUtils.readFrom(Paths
				.get("/home/rosen/workspace/Files/test/test.txt")));
	}

}
