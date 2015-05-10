package com.hackbulgaria.corejava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtils {
	private FileUtils() {

	}

	public static String readFrom(File file) throws IOException {
		List<String> ListStr = new ArrayList<>(Files.readAllLines(
				file.toPath(), Charset.defaultCharset()));
		StringBuilder builder = new StringBuilder();
		for (String string : ListStr) {
			builder.append(string);
		}
		return builder.toString();
	}

	public static String readFrom(Path path) throws IOException {
		return FileUtils.readFrom(path.toFile());
	}

	private static String[] splitValue(String line) {
		return line.split("=", 2);
	}
	public static Map<String, String> parseProperties(File file)
			throws IOException {
		Map<String, String> returnMap = new HashMap<>();
		String[] propStr = readFrom(file).split(System.lineSeparator());
		for (String str : propStr) {
			returnMap.put(splitValue(str)[0], splitValue(str)[1]);
		}
		return returnMap;

	}

	public static String reduceFilePath(Path path) {
		return path.normalize().toString();
	}

	public static void compress(Path filePath) throws IOException {
		List<String> file = Files.readAllLines(filePath,
				Charset.defaultCharset());
		Dictionary<String, Integer> decodeDic = null;
		List<String> usedWord = new ArrayList<>();
		int key = 0;
		for (String string : file) {
			for (String str : string.split(" ")) {
				if (!usedWord.contains(str)) {
					usedWord.add(str);
					decodeDic.put(str, key);
					key++;
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for (String string : file) {
			for (String str : string.split(" ")) {
				builder.append(decodeDic.get(key));
			}
		}
	}
}
