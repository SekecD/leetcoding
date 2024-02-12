import java.util.Random;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int num1, num2, result;

            if (i < 5) {
                num1 = random.nextInt(10) + 1;
                num2 = random.nextInt(10) + 1;
                result = num1 + num2;

            } else {

                num1 = random.nextInt(90) + 10;
                num2 = random.nextInt(90) + 10;
                result = num1 * num2;
            }

            if (i < 5) {
                System.out.println("Stage 1 - Question #" + (i + 1) + ":");
                System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
            } else {
                System.out.println("Stage 2 - Question #" + (i - 4) + ":");
                System.out.println("What is the product of " + num1 + " and " + num2 + "?");
            }
            int userAnswer = scanner.nextInt();

            if (userAnswer == result) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
            System.out.println();
        }
        System.out.println("Game over!");
    }
}