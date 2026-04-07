package control_flow_02;

import java.security.spec.RSAOtherPrimeInfo;

public class TernaryOperator {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        // PASS or FAIL
        int score = 40;
        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // ODD or EVEN
        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // Time of DAY
        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        // Tax Rate
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
