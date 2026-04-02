package control_flow_02;

import java.util.Scanner;
public class MathExercise1 {
    public static void main(String[] args) {

        // HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The Hypotenuse (side c) is : " + c);
    }

}
