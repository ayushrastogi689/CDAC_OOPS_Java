
package assignment;

import java.util.Scanner;
public class Day01_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year = ");
		int year = sc.nextInt();
		if((year % 4 == 0  && year%100 !=0) || (year % 400 == 0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	
	}

}
