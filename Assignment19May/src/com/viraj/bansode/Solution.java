package com.viraj.bansode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static Map<Integer,Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		
		int userNumber=4;
		int rowCount= userNumber;
		int columnCount= (userNumber * 2 ) -1;
		
		for(int row=1;row<=rowCount;row++) {
			// let r=0
			int r=0;
			/**
			 *  colm print limit 
			 *  left side userNumber-row +1
			 *  right side userNumber+row -1
			 */
			int patternLeftBorder=(userNumber-row) +1;
			int patternRightBorder=(userNumber+row) -1;
			// to print at alternate col within the pattern border
			boolean printColm =true;
			for(int col=1;col<=columnCount;col++) {
				
				if(col >= patternLeftBorder && col <= patternRightBorder) {
					
					if(printColm) {
						printData(row,r);
						r++;
						// once printed in col then skip next col
						printColm= false;
					}else {
						System.out.print(" ");
						printColm= true;
					}
				}else 
					// col out side of pattern 
					System.out.print(" ");
			}
			//end of row, go to new line
			System.out.println();
		}		  
	}
	
	// 
	public static void printData(int userNumber,int r){
		int numb = userNumber-1;
		int value= getBinomialCoefficient(numb,r);		
		System.out.print(value);
	  }  
	
	// this function is a use of Recursion 
	public static int getfactorialOfNumber(int numb) {
		
		if(numb ==0)return 1;
		
		// check cache if fact is calculated previously 
		if(cache.containsKey(numb))return cache.get(numb);
		
		//else calculate and put in cache map
		int newValueFact = numb * getfactorialOfNumber(numb-1);
		cache.put(newValueFact, numb);
		
		return newValueFact;
	}
	
	public static int getBinomialCoefficient(int n, int r) {
		return (getfactorialOfNumber(n)/ ( (getfactorialOfNumber(r) * (getfactorialOfNumber(n-r)))  )  );
	}

}
