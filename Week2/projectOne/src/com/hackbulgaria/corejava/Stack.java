package com.hackbulgaria.corejava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

//array
public class Stack implements IStack {
	private Object[] stack;
	private int pointer = 0;
	public Stack(Object...obj) {
		this.stack = new Object[obj.length];
		for (int i = 0; i < obj.length; i++) {
			this.stack[i] = obj[i];
			this.pointer+=1;
		}
	}
	private final boolean contains(Object obj){
		for (Object item : this.stack) {
			if (obj == item) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void push(Object obj) {
		//Object[] helpArr = Arrays.copyOf(this.stack, this.stack.length + 1);
		//this.stack = Arrays.copyOf(helpArr, helpArr.length);
		this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
		if (contains(obj) == false) {
			this.stack[this.pointer] = obj;
			this.pointer += 1;
		}
		else {
			System.out.println(obj + " was not added it Already Exist!!!");
			//moje i exeption da mqta :D
		}
	}
	@Override
	public Object pop() {
		Object returnObject = stack[pointer - 1];
		stack[pointer - 1] = null;
		return returnObject;
	}
	@Override
	public int length() {
		return pointer;
	}
	@Override
	public void clear() {
		for (Object obj : this.stack) {
			obj = null;
		}
		this.pointer = 0;		
	}
	@Override
	public boolean isEmpty() {
		if (this.stack[0] != null) {
			return true;
		}
		return false;
	}

//	@Override
//	public Object pop() {
//		return stack.lastElement();
//	}
//
//	@Override
//	public int length() {
//		return stack.size();
//	}
//
//	@Override
//	public void clear() {
//		stack.clear();
//	}
//
//	@Override
//	public boolean isEmpty() {
//		if (stack.isEmpty()) {
//			return true;
//		}
//		return false;
//	}

}
/*
private Vector<Object> stack;

public Stack(Object...obj) {
	for (Object object : obj) {
		push(object);
	}
}
@Override
public void push(Object obj) {
	if (stack.contains(obj) == false) {
		stack.add(obj);				
	}
	else {
		System.out.println(obj + " was not added it Already Exist!!!");
		//moje i exeption da mqta :D
	}
}

@Override
public Object pop() {
	return stack.lastElement();
}

@Override
public int length() {
	return stack.size();
}

@Override
public void clear() {
	stack.clear();
}

@Override
public boolean isEmpty() {
	if (stack.isEmpty()) {
		return true;
	}
	return false;
}*/