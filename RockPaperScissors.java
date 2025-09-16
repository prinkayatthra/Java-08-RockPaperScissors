import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        int user = sc.nextInt();
        int computer = rand.nextInt(3);

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("You chose: " + choices[user]);
        System.out.println("Computer chose: " + choices[computer]);

        if (user == computer) {
            System.out.println("It's a tie!");
        } else if ((user == 0 && computer == 2) ||
                   (user == 1 && computer == 0) ||
                   (user == 2 && computer == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}
