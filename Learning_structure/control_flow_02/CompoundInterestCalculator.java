package control_flow_02;

import java.util.Scanner;
public class CompoundInterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the number of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.print("The Amount after " + years + " years is $" + amount + ".");


        scanner.close();
    }

}
