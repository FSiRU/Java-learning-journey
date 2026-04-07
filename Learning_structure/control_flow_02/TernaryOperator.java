package control_flow_02;

import java.security.spec.RSAOtherPrimeInfo;

public class TernaryOperator {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        // PASS or FAIL
        int score = 40;
        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println("\n" + passOrFail);

        // ODD or EVEN
        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("\n" + evenOrOdd);

        // Time of DAY
        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println("\n" + timeOfDay);

        // Tax Rate
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println("\n" + taxRate);

        // Max of two numbers
        int a = 15;
        int b = 27;
        int max = (a > b) ? a : b;
        System.out.println("\nMax of " + a + " and " + b + " is: " + max);

        // Discount eligibility
        boolean isMember = true;
        double discount = isMember ? 0.20 : 0.05;
        System.out.println("\nMember: " + isMember);
        System.out.println("Discount: " + (discount * 100) + "%");
    }
}
