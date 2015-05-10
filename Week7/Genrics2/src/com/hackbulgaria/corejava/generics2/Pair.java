package com.hackbulgaria.corejava.generics2;

public class Pair<T, F> {
	private T dataOne;
	private F dataTwo;

	public void setFirst(T t) {
		this.dataOne = t;
	}

	public T first() {
		return dataOne;
	}

	public F second() {
		return dataTwo;
	}

	public void setTow(F f) {
		this.dataTwo = f;

	}

	@Override
	public String toString() {
		return "<" + dataOne.toString() + ", " + dataTwo.toString() + ">";
	}
}
