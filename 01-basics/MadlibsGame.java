import java.util.Scanner;
public class MadlibsGame {

    public static void main(String[] args) {

        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (person or animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (decription): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw " + noun + ".");
        System.out.println(noun + " was so " + adjective2 + " and " + verb + "." );
        System.out.println("He was so " + adjective3 + " Shiet! Walai he must Go.");

        scanner.close();

    }
}
