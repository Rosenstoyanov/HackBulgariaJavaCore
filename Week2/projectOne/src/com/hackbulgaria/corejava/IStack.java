package com.hackbulgaria.corejava;
//pushing an element, popping an element, length, clear, isEmpty
public interface IStack {
	public void push(Object obj);
	public Object pop();
	public int length();
	public void clear();
	public boolean isEmpty();
}
