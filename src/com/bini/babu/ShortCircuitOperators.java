package com.bini.babu;

public class ShortCircuitOperators {

	public static void main(String[] args) {
     boolean x = true, y= false;
     if(x && y) {
    	 System.out.println("Inside if");
     }
     else{
    	 System.out.println("Inside else");
     }
	}

}
