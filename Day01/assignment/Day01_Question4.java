package assignment;

import java.util.Scanner;
public class Day01_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a input : ");
        int input = in.nextInt();
        
        switch(input){
            case 1: 
            	System.out.println("Monday");
            	break ;
            case 2: 
            	System.out.println("Tuesday");
            	break ;
            case 3: 
            	System.out.println("Wednesday");
            	break;
            case 4: 
            	System.out.println("Thursday");
            	break;
            case 5: 
            	System.out.println("Friday");
            	break;
            case 6: 
            	System.out.println("Saturday");
            	break ;
            case 7:
            	System.out.println("Sunday");
            	break;
            
            default: 
            	System.out.println("Invalid range");

	}
	}
}
