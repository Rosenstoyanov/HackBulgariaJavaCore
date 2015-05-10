package com.hackbulgaria.corejava;

public class Time {
	private int hour;
	private int seconds;
	private int minutes;
	private int day;
	private int month;
	private int year;
	
	public int getHour() {
		return hour;
	}
	public int getSeconds() {
		return seconds;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}

	Time(int hour, int seconds, int minutes, int day, int month, int year){
		this.hour = hour;
		this.seconds = seconds;
		this.minutes = minutes;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public static void Now(){
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.getHour() +":"+ this.getMinutes() +":"+ this.getSeconds()
				+" "+ this.getDay() +"."+ this.getMonth() +"."+ this.getYear()).toString();
	}

}