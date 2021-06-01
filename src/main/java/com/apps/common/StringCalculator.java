package com.apps.common;

/**
 * Class for handling string addition
 * @author parth
 *
 */
public class StringCalculator {
	public StringCalculator() {
		
	}
	
	public int Add(String numbers) {
		int sum = 0;
		if(numbers.length() == 0) {
			return 0;
		}
		
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		
		for(int i=0; i<numbers.length(); i+=2) {
			int n = numbers.charAt(i) - '0';
			sum += n;
		}
		
		return sum;
	}
}
