// Q2) Create a program that demonstrates narrowing conversion from double to int and prints the result.

package assignment;

public class Day03_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleValue = 10.75;
        int intValue = (int) doubleValue; // Narrowing conversion from double to int
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);
	}

}
