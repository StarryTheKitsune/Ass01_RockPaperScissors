import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String play1;
        String play2;
        String stillPlaying;
        boolean validMove1 = false;
        boolean validMove2 = false;
        boolean playing = true;
        Scanner sc = new Scanner(System.in);

        do {
            do {
                System.out.println("Player 1, input your move: ");
                play1 = sc.nextLine();
                if (play1.equalsIgnoreCase("R") || play1.equalsIgnoreCase("P") || play1.equalsIgnoreCase("S")) {
                    validMove1 = true;
                }
                else {
                    System.out.println("Invalid move! Please only input [R][P][S].");
                }
            }
            while (!validMove1);

            do {
                System.out.println("Player 2, input your move: ");
                play2 = sc.nextLine();
                if (play2.equalsIgnoreCase("R") || play2.equalsIgnoreCase("P") || play2.equalsIgnoreCase("S")) {
                    validMove2 = true;
                }
                else {
                    System.out.println("Invalid move! Please only input [R][P][S].");
                }
            }
            while (!validMove2);


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
                }



            System.out.println("Would you like to continue playing? [Y/N]: ");
            stillPlaying = sc.nextLine();
            if (stillPlaying.equalsIgnoreCase("Y")) {
                validMove1 = false;
                validMove2 = false;
            }
            else if (stillPlaying.equalsIgnoreCase("N")) {
                playing = false;
            }
        }
        while (playing);
        System.out.println("Thank you for playing! :3");
    }
}