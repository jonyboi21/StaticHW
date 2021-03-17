package Scanner;

import java.util.Scanner;

public class asker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = userInput.nextLine();

        System.out.println("What is your number?");
        String number = userInput.nextLine();

        if (name.equalsIgnoreCase("Alice"))
        {
            System.out.println("Welcome Alice");
        } else if (name.equalsIgnoreCase("Bob")) {
            System.out.println("Welcome Bob");
        } else {
            System.out.println("Try Again");
        }
    }
}