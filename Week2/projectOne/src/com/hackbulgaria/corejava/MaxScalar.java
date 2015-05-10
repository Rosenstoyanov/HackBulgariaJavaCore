package com.hackbulgaria.corejava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxScalar {
	public long maxScalar(int[] a, int[] b){
		long result = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i++) {
			result += a[i] + b[i];
		}
		return result;
	}
	public int getNumberOfDigits(int number)
	{
		int returnNumber = 0;
		while (number > 0) {
			number /= 10;
			returnNumber++;
		}
		return returnNumber;
	}
	public String stichMeUp(String glue, Object... obj){
		StringBuilder builder = new StringBuilder();
		int notLast = obj.length - 1;
		for (int i = 0; i < obj.length; i++) {
			builder.append(obj[i]);
			if (notLast != i) {
				builder.append(glue);				
			}
		}
		return builder.toString();
		
	}

}
