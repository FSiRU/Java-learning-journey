package control_flow_02;

public class printfSpecifierCharacter {

    public static void main(String[] args){

        // Printf() = Is a method used to format output

        //%[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("You name starts with letter %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

    }
}
