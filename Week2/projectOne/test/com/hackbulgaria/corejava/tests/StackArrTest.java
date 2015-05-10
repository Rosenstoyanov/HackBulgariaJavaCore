package com.hackbulgaria.corejava.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.Stack;

public class StackArrTest {

	private Stack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new Stack(1,2,3,4);
	}

	@Test
	public void testPush() {
		stack.push(5);
		assertEquals(5, stack.pop());
	}

	@Test
	public void testPop() {
		assertEquals(4, stack.pop());
	}

	@Test
	public void testLength() {
		assertEquals(4, this.stack.length());
	}
//
	@Test
	public void testClear() {
		this.stack.clear();
		assertEquals(0, this.stack.length());
	}
//
	@Test
	public void testIsEmpty() {
		stack.clear();
		assertTrue(stack.isEmpty());
	}

}
