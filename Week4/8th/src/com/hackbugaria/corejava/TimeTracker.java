package com.hackbugaria.corejava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeTracker {
	// private Map<String, String> map;
	private final Map<String, Date> map = new HashMap<>();
	private final Map<String, ArrayList<Date>> mapUpdate = new HashMap<>();
	// fin - start
	public TimeTracker() {
		// TODO Auto-generated constructor stub
	}

	public void start(String operation) {
		Date startDate = new Date();
		map.put(operation + "s", startDate);
	}

	public void finish(String operation) {
		Date finishDate = new Date();
		map.put(operation + "f", finishDate);

	}

	public void update(String operation) {
		Date updateDate = new Date();
		if (!mapUpdate.containsKey(operation)) {
			ArrayList<Date> help = new ArrayList<>();
			help.add(updateDate);
			mapUpdate.put(operation, help);
		} else {
			ArrayList<Date> help = new ArrayList<>(mapUpdate.get(operation));
			help.add(updateDate);
			mapUpdate.put(operation, help);
		}

	}

	public String getReport(String operation) throws ParseException {
		StringBuilder builder = new StringBuilder();
		DateFormat dateFormater = new SimpleDateFormat("hh:mm dd.MM.YY");
		Date finishedTime = dateFormater.parse(dateFormater.format(map
				.get(operation + "f")));
		if (map.containsKey(operation + "f")) {
			Date startedTime = dateFormater.parse(dateFormater.format(map
					.get(operation + "s")));
			long timeOperation = finishedTime.getTime() - startedTime.getTime();
			if (mapUpdate.containsKey(operation)) {
				ArrayList<Date> help = new ArrayList<>(mapUpdate.get(operation));
				for (Date date : help) {
					builder.append(date + " -updated");
					builder.append(System.lineSeparator());
				}
			}
			return ("Operation " + operation + "took " + timeOperation
					+ System.lineSeparator() + map.get(operation + "s")
					+ " -started" + System.lineSeparator() + builder.toString()
					+ map.get(operation + "f") + " -finished");
		}
		if (mapUpdate.containsKey(operation)) {
			ArrayList<Date> help = new ArrayList<>(mapUpdate.get(operation));
			for (Date date : help) {
				builder.append(date + " -updated");
				builder.append(System.lineSeparator());
			}
		}
		return map.get(operation + "s") + " -started" + builder;

	}

	public static void main(String[] args) throws ParseException {
		TimeTracker timeTracker = new TimeTracker();
		timeTracker.start("Neshto");
		timeTracker.update("Neshto");
		timeTracker.update("Neshto");
		timeTracker.finish("Neshto");
		System.out.println(timeTracker.getReport("Neshto"));
	}
}
