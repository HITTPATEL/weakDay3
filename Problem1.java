package com.weak1day3;

public class Problem1 {
    int i=2;
    static int j=3;
	public static void main(String[] args) {
		//To print non-static  variable inside a main method, we have  to create an object  using new keyword.
		Problem1 p1=new Problem1();
		System.out.println(p1.i);
		
		//To print static variable inside main method we can access it in three ways:-
		//First way:- Using class
		System.out.println(Problem1.j);
		
		// Second way:- Using object
		
		System.out.println(p1.j);
		
		// Third way :- We can directly print static variable inside main method.
		
		System.out.println(j);
	}

}
