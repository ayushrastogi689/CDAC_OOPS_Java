// Q1) Write a Java program that demonstrates widening conversion from int to double and prints the result.

package assignment;

public class Day03_Question1 {

	    public static void main(String[] args) {
	        int intValue = 10;
	        double doubleValue = (double) intValue; // Widening conversion from integer to double
	        System.out.println("Original int value: " + intValue);
	        System.out.println("Widened double value: " + doubleValue);
	    }
	}
