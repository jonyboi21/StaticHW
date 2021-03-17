package tempature;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        System.out.println("Do you think the temperature is High, Low, or Humid?");
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.next();


        if(answer.equals("High")) {
            System.out.println("sunblock may be needed");

        } else if (answer.equals("Low")){
            System.out.println("a coat may be needed");
        } else if (answer.equals("Humid")) {
            System.out.println("It's muggy!");
        } else {
            System.out.println("Invalid response");


        }
    }
}