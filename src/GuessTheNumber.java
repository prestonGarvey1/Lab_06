import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        // make randomNumber generate a number 1 to 10
        int randomNumber = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        boolean isValid = false;

       // Start the guessing game
        do {
            System.out.print("Guess the number (1 to 10): ");

            try {
                // Read the player's guess
                userGuess = scanner.nextInt();

                // Check if the value is within the range (1-10)
                if (userGuess >= 1 && userGuess <= 10) {
                    isValid = true;
                } else {
                    System.out.println("The guess must be a number between 1 and 10, Try again.");
                }

            } catch (InputMismatchException e) {
                // If the input is other than a whole number
                System.out.println("Please enter a whole number between 1 and 10, Try again.");
                scanner.next();

            }

        } while (!isValid);

        // Display results

        System.out.println("\nResults");
        System.out.println("The secret number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Correct! You guessed the right number!");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! Your guess was greater than the secret number.");
        } else {
            System.out.println("Too low! Your guess was less than the secret number.");
        }

        scanner.close();
    }
}