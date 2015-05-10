package com.hackbulgaria.corejava;

public class Logger {
	private int logLevel;
	public Logger() {
		this.logLevel = 3;
	}
	public Logger(int logLevel) {
		if (logLevel > 0) {
			this.logLevel = logLevel;
		}
	}
	
	public void log(String message){
		System.out.print(this.logLevel + " => " + message);
	}
	public void log(int level, String message){
		if (this.logLevel >= level) {
			System.out.print(level + " => " + message);
		}
	}
}
