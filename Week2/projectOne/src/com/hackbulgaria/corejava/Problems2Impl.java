package com.hackbulgaria.corejava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class Problems2Impl implements Problems2 {

	@Override
	public boolean isOdd(int number) {
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isPrime(int number) {
		if (number > 2) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public int min(int... array) {
		int minElem = array[0];
		for (int i : array) {
			if (minElem > i) {
				minElem = i;
			}
		}
		return minElem;
	}

	@Override
	public int kthMin(int k, int[] array) {
		Arrays.sort(array);
		int returnValue = array[k - 1];
		return returnValue;
	}

	@Override
	public float getAverage(int[] array) {
		float avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
		}
		return avg /= array.length;
	}

	@Override
	public long getSmallestMultiple(int upperBound) {
		// boolean haveResult = true;
		// long returnValue = 0;
		// long boundery = 1;
		// for (int i = 1; i < boundery; i++) {
		// boundery *= i;
		// }
		// for (long i = boundery; i == 1; i--) {
		// for (long j = 1; j == upperBound; j++) {
		// if (haveResult) {
		// if (i % j == 0) {
		// haveResult = true;
		// returnValue = j;
		// } else {
		// haveResult = false;
		// }
		// }
		// }
		// if (haveResult == false) {
		// haveResult = true;
		// }
		// }
		// return returnValue;
		for (int i = 1;; i++) {
			if (dividesAll(i, upperBound)) {
				return i;
			}
		}
	}

	//
	public boolean dividesAll(long num, long bound) {
		for (int i = 1; i < bound; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public long getLargestPalindrome(long N) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] histogram(short[][] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long doubleFac(int n) {
		long firstFactResult = 1;
		for (int i = 1; i <= n; i++) {
			firstFactResult *= i;
		}
		long returnValue = 1;
		for (int i = 1; i <= firstFactResult; i++) {
			returnValue *= i;
		}
		return returnValue;
	}

	@Override
	public long kthFac(int k, int n) {
		long fact = 1;
		long currFact = n;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= currFact; j++) {
				fact *= j;
			}
			currFact = fact;
		}
		return fact;
	}

	@Override
	public int getOddOccurrence(int[] array) {
		Arrays.sort(array);
		int lastUsedNumber = array[0];
		int timesMeet = 0;
		int maxLen = 0;
		int numberMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (lastUsedNumber == array[i]) {
				timesMeet += 1;
			} else {
				if (timesMeet + 1 > maxLen) {
					double a = timesMeet % 2;
					if (((timesMeet + 1) % 2) != 0) {
						maxLen = timesMeet;
						numberMax = array[i - 1];
					}
				}
				timesMeet = 0;
				lastUsedNumber = array[i + 1];
			}

		}
		return numberMax;
	}

	@Override
	public long pow(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long maximalScalarSum(int[] a, int[] b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxSpan(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean canBalance(int[] array) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[][] rescale(int[][] original, int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseMe(String argument) {
		// TODO Auto-generated method stub
		char[] charArr = argument.toCharArray();
		char[] returnChar = new char[argument.length()];
		for (int i = 0; i <= charArr.length; i++) {
			returnChar[i] = charArr[i - charArr.length];
		}
		String str = returnChar.toString();
		return str;
	}

	@Override
	public String copyEveryChar(String input, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseEveryWord(String arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPalindrome(String argument) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPalindrome(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPalindromeLength(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countOcurrences(String needle, String haystack) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String decodeURL(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sumOfNumbers(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areAnagrams(String A, String B) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAnagramOf(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

}
