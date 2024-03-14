// Q3) Write a program that performs arithmetic operations involving different data types 
// (int, double, float) and observes how Java handles widening conversions automatically. 

package assignment;

public class Day03_Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 5;
        double doubleValue = 3.5;
        float floatValue = 2.5f; // Notice the 'f' suffix to indicate float literal
        
        // Performing arithmetic operations involving different data types
        double result1 = intValue + doubleValue; // int is widened to double
        float result2 = floatValue * intValue; // int is widened to float
        double result3 = doubleValue / floatValue; // float is widened to double
        
        // Printing the results
        System.out.println("Result of int + double: " + result1);
        System.out.println("Result of float * int: " + result2);
        System.out.println("Result of double / float: " + result3);
	}

}
