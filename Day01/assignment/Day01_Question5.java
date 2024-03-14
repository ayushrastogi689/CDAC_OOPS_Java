package assignment;

import java.util.Scanner;
public class Day01_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char y = sc.next().charAt(0);
		
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
	            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
	            || y == 'O' || y == 'U')
	            System.out.println("It is a Vowel.");
	        else {
	            System.out.println("It is a Consonant.");
	    }

	}

}
