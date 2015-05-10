package com.hackbulgaria.helloworld;

import java.util.Arrays;

public class Problems {
	boolean isOdd(int n){
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}
	
	boolean isPrime(int n){
		for (int i = 2; i < n; i++) {
			if(n / i == 0){
				return false;
			}
		}
		return true;
	}
	
	int min(int...array){
		int minElem = array[0];
		for (int i : array) {
			if (minElem > array[i]) {
				minElem = array[i];
			}
		}
		return minElem;
	}
	
	int kthMin(int k, int[] array){
		Arrays.sort(array);
		int returnValue = array[k - 1];
		return returnValue;
		//do 5ta zada4a
		//arrToReturn
	}
	
	int getAverage(int[] array){
		int sumElem = 0;
		for (int i : array) {
			sumElem += array[i];
		}
		return sumElem / array.length;
		
	}
}
