package com.hackbulgaria.corejava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WordCountResult {
	private File file;
	private Path path;

	// int getLineCount(); //returns number of lines
	// int getWordCount(); //returns number Of words in File
	// int getCharacterCount(); //returns number of characters in the file.
	public static String readFrom(File file) throws IOException {
		List<String> ListStr = new ArrayList<>(Files.readAllLines(
				file.toPath(), Charset.defaultCharset()));
		StringBuilder builder = new StringBuilder();
		for (String string : ListStr) {
			builder.append(string);
		}
		return builder.toString();
	}

	private static int getLineCount(File file) throws IOException {
		int returnInt = 0;
		String[] propStr = readFrom(file).split(System.lineSeparator());
		for (String string : propStr) {
			returnInt += 1;
		}
		return returnInt;
	}

	private static int getCharacterCount(File file) throws IOException {
		int returnInt = 0;
		char[] propStr = readFrom(file).toCharArray();
		for (char c : propStr) {
			returnInt += 1;
		}
		return returnInt;
	}

	private static int getWordCount(File file) throws IOException {
		int returnInt = 0;
		List<String> list = Files.readAllLines(file.toPath(),
				Charset.defaultCharset());
		for (String string : list) {
			returnInt += string.split(" ").length;
		}
		return returnInt;
	}
}
