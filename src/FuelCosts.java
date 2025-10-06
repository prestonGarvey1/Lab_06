import java.util.Scanner;
import java.text.DecimalFormat;

public class FuelCosts {

    public static void main(String[] args) {
        // Create scanner obj and decimal format
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Variables to store user input
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        System.out.println("Fuel Cost and Range Calculator");

        // Get the gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            try {
                // Check if the input is a double
                if (scanner.hasNextDouble()) {
                    gallons = scanner.nextDouble();
                    // Check for the condition Gals >= 0
                    if (gallons >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid input: The number of gallons must be zero or positive. Please try again.");
                    }
                } else {
                    // Input was not a double
                    String badInput = scanner.next();
                    System.out.println("Invalid input: '" + badInput + "' is not a valid data type. Please try again.");
                }
            } catch (Exception e) {
                // Catch any other errors
                System.out.println("An unexpected error occurred. Please try again.");
                scanner.nextLine();
            }
        } while (true);

        // Get Fuel Efficiency
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            try {
                // Check if the input is a double
                if (scanner.hasNextDouble()) {
                    fuelEfficiency = scanner.nextDouble();
                    // Check for the condition MPG > 0
                    if (fuelEfficiency > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input: Fuel efficiency must be greater than zero. Please try again.");
                    }
                } else {
                    // Input was not a double
                    String badInput = scanner.next();
                    System.out.println("Invalid input: '" + badInput + "' is not a valid number. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Please try again.");
                scanner.nextLine();
            }
        } while (true);

        // Get Price of Gas Per Gallon
        do {
            System.out.print("Enter the price of gas per gallon: $");
            try {
                // Check if the input is a double
                if (scanner.hasNextDouble()) {
                    pricePerGallon = scanner.nextDouble();
                    // Check for the condition Price per Gallon
                    if (pricePerGallon > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input: The price of gas must be greater than zero. Please try again.");
                    }
                } else {
                    // Input was not a double
                    String badInput = scanner.next();
                    System.out.println("Invalid input: '" + badInput + "' is not a valid number. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Please try again.");
                scanner.nextLine();
            }
        } while (true);

        scanner.close();


        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double range = gallons * fuelEfficiency;

        System.out.println("Results");
        System.out.println("The cost to travel 100 miles is: $" + df.format(costPer100Miles));
        System.out.println("The car can travel a total distance of: " + df.format(range) + " miles");
    }
}