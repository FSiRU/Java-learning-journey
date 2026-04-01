package basics_01;

import java.util.Scanner;

public class UserInputBasics {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("\n=== Your Info ===");
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + gpa);
        
        if (isStudent) {
            System.out.println("You are enrolled as a Student.");
        } else {
            System.out.println("You are NOT enrolled as a Student.");
        }
        
        scanner.close();
    }
}
