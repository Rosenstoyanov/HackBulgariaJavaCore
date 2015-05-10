package com.hackbulgaria.corejava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListMethodsTests {
	
	ListMethods lm;
	
	@Before
	public void setUp(){
		lm = new ListMethods();
	}
	@Test
	public void testSortList() {
		List<Integer> testList = new ArrayList<>(Arrays.asList(1,5,6,7,4));
		List<Integer> testList2 = new ArrayList<>(Arrays.asList(1,4,5,6,7));
		List<Integer> returnList = new ArrayList<>();
		returnList = lm.sortList(testList);
        assertEquals(testList2, returnList);
	}
	@Test
	public void isMonotonous(){
		List<Integer> testList = new ArrayList<>(Arrays.asList(1,5,6,7,4));
		assertEquals(false, lm.isMonotonous(testList));
	}

}
