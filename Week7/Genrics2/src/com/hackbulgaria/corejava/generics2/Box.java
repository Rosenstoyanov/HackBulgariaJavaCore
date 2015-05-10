package com.hackbulgaria.corejava.generics2;

public class Box<Type> {
	private Type type;

	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(Type type) {
		this.type = type;
	}

	public void set(Type type) {
		this.type = type;
	}

	public Type get() {
		return type;
	}
}
