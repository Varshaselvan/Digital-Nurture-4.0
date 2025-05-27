import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > targetNumber) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempt(s).");
            }
        } while (guess != targetNumber);

        input.close();
    }
}