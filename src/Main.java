import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        String play1 = "";
        String play2 = "";
        String stillPlaying = "";
        boolean playing = true;

        do {
            System.out.println("Player 1, input your move: ");
            Scanner sc = new Scanner(System.in);
            play1 = sc.nextLine();
            System.out.println("Player 2, input your move: ");
            play2 = sc.nextLine();

                if (play1.equalsIgnoreCase("R")) {
                    if (play2.equalsIgnoreCase("R")) {
                        System.out.println("ROCK vs ROCK... It's a tie!!");
                    }
                    else if (play2.equalsIgnoreCase("P")) {
                        System.out.println("PAPER covers ROCK, Player 2 Wins!");
                    }
                    else if (play2.equalsIgnoreCase("S")) {
                        System.out.println("ROCK breaks SCISSORS, Player 1 Wins!");
                    }
                    else {
                        System.out.println("Player 2's input is invalid! Please only input [R] [P] or [S]!");
                    }
                }
                else if (play1.equalsIgnoreCase("P")) {
                    if (play2.equalsIgnoreCase("R")) {
                        System.out.println("PAPER covers ROCK, Player 1 Wins!");
                    }
                    else if (play2.equalsIgnoreCase("P")) {
                        System.out.println("PAPER vs PAPER... It's a tie!!");
                    }
                    else if (play2.equalsIgnoreCase("S")) {
                        System.out.println("SCISSORS cuts PAPER, Player 2 Wins!");
                    }
                    else {
                        System.out.println("Player 2's input is invalid! Please only input [R] [P] or [S]!");
                    }
                }
                else if (play1.equalsIgnoreCase("S")) {
                    if (play2.equalsIgnoreCase("R")) {
                        System.out.println("ROCK breaks SCISSORS, Player 2 Wins!");
                    }
                    else if (play2.equalsIgnoreCase("P")) {
                        System.out.println("SCISSORS cuts PAPER, Player 1 Wins!");
                    }
                    else if (play2.equalsIgnoreCase("S")) {
                        System.out.println("SCISSORS vs SCISSORS... It's a tie!!");
                    }
                    else {
                        System.out.println("Player 2's input is invalid! Please only input [R] [P] or [S]!");
                    }
                }
                else {
                    System.out.println("Player 1's input is invalid! Please only input [R] [P] or [S]!");

                }


            System.out.println("Would you like to continue playing? [Y/N]: ");
            stillPlaying = sc.nextLine();
            if (stillPlaying.equalsIgnoreCase("Y")) {
            }
            else if (stillPlaying.equalsIgnoreCase("N")) {
                playing = false;
            }
        }
        while (playing);
        System.out.println("Thank you for playing! :3");
    }
}