package com.weak1day3;

public class Problem3 {
     String a;
     void findType(String b) {
    	 if( b=="b" || b=="c" || b=="d"  ||  b=="f"  || b=="g"  || b=="h" || b=="j" || b=="k" || b=="l" ||  b=="m" ||  b=="n" 
    			  || b=="p" || b=="q" || b=="r" ||  b=="s" ||   b=="t" ||  b=="v" ||  b=="w" ||  b=="x" ||  b=="y" ||  b=="z" || 
    			  b=="B" ||  b=="C" ||  b=="D" ||   b=="F" ||  b=="G" ||  b=="H" ||    b=="J" ||  b=="K" || 
    			  b=="L" ||  b=="M" ||  b=="N" ||  b=="P" ||  b=="Q" ||  b=="R" ||  b=="S" ||  b=="T" ||  b=="V" ||  b=="W" ||  b=="X" || 
    			  b=="Y" ||  b=="Z" ) {
    		 System.out.println("Character is consonent");
    	 }
    	 else if(b=="a" ||  b=="e" ||  b=="i"  || b=="o"  || b=="u"  || b=="A" ||  b=="E" || b=="I" ||  b=="O" || b=="U") {
    		 System.out.println("Character is vowel");
    	 }
    	 else {
    		 System.out.println("Invalid chararcter");
    	 }
     }
	
	 public static void main(String[] args) {
		
		 Problem3 p3=new Problem3();
		    p3.a="a";
		    p3.findType(p3.a);
		 
		 
	}
}
