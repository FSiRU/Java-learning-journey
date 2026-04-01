package control_flow_02;

import java.util.Random;
public class RandomNumbers {

    public static void main(String[] args) {

        //Random Numbers
        Random random = new Random();

        Double number1;
        int number2;
        boolean isHeads;

        number1 = random.nextDouble(1,7);
        number2 = random.nextInt(1,7);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);

        if(isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }

    }
}
