package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {
	public List<Integer> sortList(List<Integer> intList){
		List<Integer> copyList = new ArrayList<>(intList);
		Collections.sort(copyList);
		List<Integer> listToReturn = new ArrayList<>(copyList);
		return listToReturn;
	}
	
	public List<Integer> reverseList(List<Integer> intList){
		Collections.reverse(intList);
		List<Integer> listToReturn = new ArrayList<>(intList);
		return listToReturn;
	}
	private boolean compareList(List<Integer> intsList1, List<Integer> intsList2){
		for (int i = 0; i < intsList1.size(); i++) {
			if (intsList1.get(i) != intsList2.get(i)) {
				return false;
			}
		}
		return true;
	}
	public boolean isMonotonous(List<Integer> intsList){
		List<Integer> sortedList = new ArrayList<>(sortList(intsList));
//		if (condition) {
//			
//		}
//		return true;
		// if sortiranoto e ravno na teky6toto i dali sortirano i revursnato e ravno ne teky6toto
		
		return compareList(sortedList, intsList) || compareList(reverseList(sortedList), intsList);
	}
}
