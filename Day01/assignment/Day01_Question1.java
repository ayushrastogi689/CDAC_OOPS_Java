package assignment;

import java.util.Scanner;

public class Day01_Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter the numerical grade
	        System.out.print("Enter the numerical grade: ");
	        int grade = sc.nextInt();

	        // Convert numerical grade to letter grade and print the result
	        char letterGrade = convertToLetterGrade(grade);
	        System.out.println("The corresponding letter grade is: " + letterGrade);

	        // Close the Scanner to avoid resource leaks
	        sc.close();
	    }

	    // Function to convert numerical grade to letter grade
	    public static char convertToLetterGrade(int grade) {
	        if (grade >= 90 && grade <= 100) {
	            return 'A';
	        } else if (grade >= 80 && grade < 90) {
	            return 'B';
	        } else if (grade >= 70 && grade < 80) {
	            return 'C';
	        } else if (grade >= 60 && grade < 70) {
	            return 'D';
	        } else if (grade >= 0 && grade < 60) {
	            return 'F';
	        } else {
	            return 'I'; // 'I' for Invalid Grade
	        }
	    }

}
