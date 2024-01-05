import java.util.*;

public class numbergame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lower_Bound = 1;
        int upper_Bound = 150;
        int score = 0;

        boolean play_Again = true;

        while (play_Again) {
            int attempts = 0;
            int max_attempts = 10;
            int generated_Number = random.nextInt(upper_Bound - lower_Bound ) + lower_Bound;
            boolean guessed_Correctly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between " + lower_Bound + " and " + upper_Bound + ". Try to guess it.");

            while (attempts < max_attempts && !guessed_Correctly) {
                System.out.print("Enter your guess: ");
                int user_Guess = sc.nextInt();
                attempts++;

                if (user_Guess == generated_Number) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessed_Correctly = true;
                    score += max_attempts - attempts + 1;
                } else if (user_Guess < generated_Number) {
                    System.out.println("Too low! Try again...");
                } else {
                    System.out.println("Too high! Try again...");
                }
            }

            if (!guessed_Correctly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + generated_Number);
            }

            System.out.print("Your current score: " + score + "\n");

            System.out.print("Do you want to play again? (y/n): ");
            String play_Again_Input = sc.next().toLowerCase();
            play_Again = play_Again_Input.equals("y");
        }

        System.out.println("Thanks for playing! Your final score: " + score + "");
        sc.close();
    }
}
