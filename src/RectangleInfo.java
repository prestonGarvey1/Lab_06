import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        boolean isValid;

        // Side 1
        do {
            System.out.print("Enter length for Side 1: ");

            if (scanner.hasNextDouble()) {
                side1 = scanner.nextDouble();
                isValid = side1 > 0;
                if (!isValid) System.out.println("Must be positive, try again");
            } else {
                System.out.println("Invalid number format, try again.");
                scanner.next();
                isValid = false;
            }
        } while (!isValid);

        // Side 2
        do {
            System.out.print("Enter length for Side 2: ");
            if (scanner.hasNextDouble()) {
                side2 = scanner.nextDouble();
                isValid = side2 > 0;
                if (!isValid) System.out.println("Must be a positive number, try again.");
            } else {
                System.out.println("Invalid number format, try again.");
                scanner.next();
                isValid = false;
            }
        } while (!isValid);

        // calculations and output
        double area = side1 * side2;
        double perimeter = 2 * (side1 + side2);
        double diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)); // Had to learn some math commands for this

        System.out.println("\nResults:");
        System.out.printf("Side 1: %.2f\n", side1);
        System.out.printf("Side 2: %.2f\n", side2);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal Length: %.2f\n", diagonal);

        scanner.close();
    }
}
