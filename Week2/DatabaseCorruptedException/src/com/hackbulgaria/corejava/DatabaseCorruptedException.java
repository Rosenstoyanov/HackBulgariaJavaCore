package com.hackbulgaria.corejava;

public class DatabaseCorruptedException extends RuntimeException {
	
	public DatabaseCorruptedException(){
		super("Data Base has been corupted!!!");
	}
	
}
