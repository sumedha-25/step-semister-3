import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"rock", "paper", "scissors"};
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.print("Enter number of rounds: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Round " + i + " - Enter rock/paper/scissors: ");
            String playerMove = sc.next().toLowerCase();

            String computerMove = moves[random.nextInt(3)];

            String result = new RockPaperScissorsGame()
                    .playRound(playerMove, computerMove);

            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + result);

            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        sc.close();
    }
}