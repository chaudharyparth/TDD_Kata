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
		int res = 0;
		if(numbers.length() == 0) {
			return 0;
		}
		
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		
		return res;
	}
}
