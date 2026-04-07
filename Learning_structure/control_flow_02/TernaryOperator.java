package control_flow_02;

import java.security.spec.RSAOtherPrimeInfo;

public class TernaryOperator {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 40;
        int number = 4;
        int hours = 13;
        int income = 60000;

        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
    }
}
