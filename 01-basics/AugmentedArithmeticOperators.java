public class AugmentedArithmeticOperators {

    public static void main(String[] args) {

        // Augmented Assignment Operators

        int x = 10;
        int y = 3;

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;

        //System.out.println(x);

        // Increment and Decrement Operators

        int k = 10;
        int j = 3;

        //k += 1;
        //k -= 1;

        k ++;
        j --;

        System.out.println(k);
        System.out.println(j);

        /* Order of Operations [P-E-M-D-A-S] -
        Parenthesis - Exponential - Multiplication - Division - Addition - Subtraction
        */

        double result = 3 + 4 * (7 - 5) / 2;
        System.out.println(result);

    }
}
