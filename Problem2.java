package com.weak1day3;

public class Problem2 {
	
	
    public static void main(String[] args) {
    	
    	boolean isSnowing = false;
    	boolean isRaining = false;
    	double temperature = 9.0;
    	
    	if(isRaining || isSnowing || temperature<10) {
    		System.out.println("Let’s stay home.");
    	}
    	else {
    		System.out.println("Let’s go out!");
    	}
		
	}
}
