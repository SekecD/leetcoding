import java.util.Random;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Can you guess it number ?");

        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;

        do {
            System.out.println("Enter your guess");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it right!");
                System.out.println("You took " + attempts);
            }
        } while (guess != randomNumber);
    }
}