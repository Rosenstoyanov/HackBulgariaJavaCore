package com.hackbulgaria.corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateLogger extends Logger{
	@Override
	public void log(int level, String message) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("|" + dateFormat.format(date) + "|   ");
		super.log(level, message);
	}
	
	@Override
	public void log(String message) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("|" + dateFormat.format(date) + "|  ");
		super.log(message);
	}
}
