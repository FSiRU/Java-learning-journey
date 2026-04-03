package control_flow_02;

import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- College Admission Check ---");

        System.out.print("Enter your test score (0-100): ");
        int score = scanner.nextInt();

        System.out.print("Enter your GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();

        if (score >= 80) {
            System.out.println("You passed the test requirement!");

            // Nested if inside the outer if
            if (gpa >= 3.5) {
                System.out.println("✅ You are eligible for scholarship!");
            } else if (gpa >= 3.0) {
                System.out.println("✅ You are eligible for admission (no scholarship).");
            } else {
                System.out.println("⚠️ Your GPA is too low for admission.");
            }

        } else {
            System.out.println("❌ You did not meet the test score requirement.");

            // Nested if inside the else block
            if (score >= 70) {
                System.out.println("   But you are close! Consider retaking the test.");
            }
        }

        scanner.close();
    }
}