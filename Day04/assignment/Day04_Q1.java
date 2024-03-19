package assignment;

public class Day04_Q1 {

	private String name;
    private int age;
    private String grade;

    // Constructor to initialize the Student object
    public Day04_Q1(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create an instance of Student
        Day04_Q1 student1 = new Day04_Q1("Ayush Rastogi", 24, "A");

        // Display student details
        student1.displayDetails();
    }

}
