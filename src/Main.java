import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        String response = "y";
        System.out.println("Welcome! Roll the dice!");
        int score = 0;
        int turns = 0;
        // Continue with just a y in case a user misspells 'yes'
        while (response.contains("y")) {
            int scoreThisTurn = 0;
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if (roll1 == 1 && roll2 == 1) {
                scoreThisTurn = 25;
            } else if (roll1 == 1 || roll2 == 1) {
                scoreThisTurn = 0;
            } else {
                scoreThisTurn = roll1 + roll2;
            }
            score += scoreThisTurn;
            turns++;
            System.out.println("You rolled " + roll1 + " and " + roll2 + "!\n"
                    + "You gained " + scoreThisTurn + "!\nScore: " + score);
            if (score >= 100) {
                System.out.println("You've reached 100! Congratulations!\nTurns: " + turns);
                response = "n";
            } else {
                System.out.println("Roll again? Type 'yes'; otherwise" +
                        " type 'no'.");
                response = read.nextLine();
            }
        }
        System.out.println("Goodbye!");
    }
}
