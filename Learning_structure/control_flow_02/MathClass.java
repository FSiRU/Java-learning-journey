package control_flow_02;

public class MathClass {

    public static void main(String[] args) {

        //System.out.println(Math.PI); - pie
        //System.out.println(Math.E);  - exponential

        double result;

        result = Math.pow(2, 5); // Power
        result = Math.abs(-5); // absolute value
        result = Math.sqrt(9); // square root
        result = Math.round(3.17); // round
        result = Math.ceil(3.7); // round up
        result = Math.floor(3.99); // round down
        result = Math.max(10, 20); // max value
        result = Math.min(5, 20); // min value

        System.out.println(result);
    }
}
