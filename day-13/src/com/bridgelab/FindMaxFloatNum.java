package com.bridgelab;

import java.util.Scanner;

public class FindMaxFloatNum {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter first number.");
        	
        Float f1 = scanner.nextFloat();
        	System.out.println("Enter second number");
        Float f2 = scanner.nextFloat();
       //return the greater of two values
        Float f3= Float.max(f1,f2);
        	System.out.println("The Max value is: "+f3);
    }

}
