public class Variables {
    
    public static void main(String[] args) {
        
        // Integers
        int age = 23;
        int year = 2026;
        int quantity = 1;
        
        System.out.println(quantity);
        System.out.println(year);
        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println("The age is " + age);
        System.out.println("The quantity is " + quantity);
        
        // Decimals (doubles)
        double price = 19.5;
        double gpa = 3.9;
        double temperature = -12.5;
        
        System.out.println("The price is $" + price);
        System.out.println("The temperature is " + temperature);
        System.out.println("He graduated with a gpa of " + gpa + " points");
        
        // Characters
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        
        System.out.println("He got an " + grade + " in Math");
        System.out.println("Shiet can be accompanied by " + symbol);
        System.out.println("This " + currency + " is the official US currency symbol");
        
        // Booleans
        boolean isSymbol = true;
        boolean isGrade = false;
        boolean isGpa = false;
        
        System.out.println(isSymbol);
        System.out.println(isGrade);
        System.out.println(isGpa);
        
        if (isSymbol) {
            System.out.println("This is a symbol");
        } else {
            System.out.println("This is NOT a symbol");
        }
        
        // Strings
        String name = "Fanuel";
        String food = "Kuku Choma";
        String email = "fanuel@gmail.com";
        
        System.out.println("My name is " + name);
        System.out.println(name + "'s favorite food is " + food);
        System.out.println(name + " used this email: " + email + " to order " + food);
    }
}
