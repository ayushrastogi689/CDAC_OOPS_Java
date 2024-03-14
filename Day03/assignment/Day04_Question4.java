// Q 4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)
// and prints the result

package assignment;

public class Day04_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intValue = 10;
        
        // Widening conversion from int to double
        double doubleValue = intValue;
        System.out.println("Widened int to double: " + doubleValue);
        
        // Widening conversion from int to float
        float floatValue = intValue;
        System.out.println("Widened int to float: " + floatValue);
        
        // Widening conversion from int to boolean
        boolean booleanValue = intValue != 0;
        System.out.println("Widened int to boolean: " + booleanValue);
        
        // Widening conversion from int to String
        String stringValue = Integer.toString(intValue);
        System.out.println("Widened int to String: " + stringValue);
	}

}
