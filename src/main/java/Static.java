import java.text.DecimalFormat;
import java.util.Scanner;
public class Static {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("How many do You need ");

        float quantityGiven = userInput.nextFloat();
        System.out.println("At what price do you want it at?");

        float priceGiven = userInput.nextFloat();

        float total = quantityGiven * priceGiven;


        System.out.printf("%-22s%-22s%-22s\n", "Quantity", "Price", "Total");
        System.out.printf("%-22s%-22s%-22s\n", "---", "---", "---");
        System.out.printf("%-22d%-22d%-22d%\n", quantityGiven, priceGiven, total);
    }
}