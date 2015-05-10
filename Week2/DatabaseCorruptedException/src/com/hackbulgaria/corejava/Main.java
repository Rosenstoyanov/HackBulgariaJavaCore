package com.hackbulgaria.corejava;

public class Main {
	public static void dataBaseCorrupted(){
		throw new DatabaseCorruptedException();
	}
	
	public static void useService(){
		
	}
	
	public static void main(String[] args) {
		try {
			dataBaseCorrupted();
		} 
		finally{
			
		}
	}
}
