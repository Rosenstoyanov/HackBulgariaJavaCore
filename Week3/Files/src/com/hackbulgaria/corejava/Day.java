package com.hackbulgaria.corejava;

public enum Day {
	MONDAY("HOLA"), TUESDAY("Ihy"), WEDNESDAY("Ihy"), THURSDAY("Ihy"), FRIDAY(
			"Ihy"), SATURDAY("Ihy"), SUNDAY("Ihy");
	public String sth;

	Day(String str) {
		this.sth = str;
	}

	private static String greetMe(Day day) {
		return day.sth;
	}
}
