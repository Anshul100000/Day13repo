package com.bridgelab;

public class MaxString {
	
	public static void main(String[] args) { 
	    String[] FruitNames = {"appple", "banana", "peach"};
	    String a= getLongestString(FruitNames);
	    System.out.println(a);
	}

	public static String getLongestString(String []FruitNames) {
		
	    int j = 0;
	    for (j = 0; j <= FruitNames.length; j++) {
	        if (FruitNames[j].length() > FruitNames[j + 1].length()) {
	                return (FruitNames[j]);
	            }
	        }
	        return null;
	    }

	}

