
import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scan = new Scanner(System.in);

        // Values
        double fahrenheit = 0.0;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Fahrenheit to be converted: ");
            String input = scan.nextLine();
            try {
                fahrenheit = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                validInput = false;
            }
        } while (!validInput);

        double celsius = (5*(fahrenheit - 32.0) / 9.0);
        System.out.printf("Temperature in fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in celsius: %.2f°F%n", celsius);

    }
}
