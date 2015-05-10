package com.hackbulgaria.corejava.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.MaxScalar;

public class MaxScalarTests {
	
	private MaxScalar ms;
	
	@Before
	public void setUp() throws Exception {
		ms = new MaxScalar();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test	
	public void testGetNumberOfDigits(){
		assertEquals(4, ms.getNumberOfDigits(1234));
		
	}
	
	@Test
	public void teststichMeUp(){
		assertEquals("da da", ms.stichMeUp(" ","da","da"));
	}

}
