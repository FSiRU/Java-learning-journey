package control_flow_02;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Password";

        //int length = name.length();
        //char letter = name.charAt(3);
        //int index = name.indexOf("a");
        //int lastIndex = name.lastIndexOf("w");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("a", "e");

        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex);
        //System.out.println(name);

        /*
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        }
        else {
            System.out.println("Your name is: " + name);
        }


        if (name.contains(" ")) {
            System.out.println("Your name conatins a space");
        }
        else {
            System.out.println("Your name DOESN'T contain any space");
        }


         */

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }

    }
}
