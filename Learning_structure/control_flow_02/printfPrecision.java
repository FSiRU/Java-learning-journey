package control_flow_02;

public class printfPrecision {

    public static void main(String[] args) {

        // Printf() = Is a method used to format output

        //%[flags][width][.precision][specifier-character]

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 65.55;
        double price2 = 99.09;
        double price3 = -54.67;

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.2f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
