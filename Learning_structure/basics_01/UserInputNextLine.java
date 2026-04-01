package basics_01;

import java.util.Scanner;

public class UserInputNextLine {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Consume the leftover newline character
        scanner.nextLine();
        
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        
        System.out.println("\n=== Your Info ===");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color);
        
        scanner.close();
    }
}
