package control_flow_02;

import java.util.Scanner;
public class MathExercise2 {

    public static void main (String[] args) {

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(r, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double area;
        double circumference;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm²");
        System.out.print("The volume is: " + volume + "cm³");

        scanner.close();
    }
}
