import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String play1;
        String play2;
        String stillPlaying;
        boolean playing = true;
        Scanner sc = new Scanner(System.in);

        do {
            do {
                System.out.println("Player 1, input your move: ");
                play1 = sc.nextLine();
                if (play1.equalsIgnoreCase("R") || play1.equalsIgnoreCase("P") || play1.equalsIgnoreCase("S")) {
                }
                else {
                    System.out.println("Invalid move! Please only input [R][P][S].");
                }
            }
            while (!(play1.equalsIgnoreCase("R") || play1.equalsIgnoreCase("P") || play1.equalsIgnoreCase("S")));

            do {
                System.out.println("Player 2, input your move: ");
                play2 = sc.nextLine();
                if (play2.equalsIgnoreCase("R") || play2.equalsIgnoreCase("P") || play2.equalsIgnoreCase("S")) {
                }
                else {
                    System.out.println("Invalid move! Please only input [R][P][S].");
                }
            }
            while (!(play2.equalsIgnoreCase("R") || play2.equalsIgnoreCase("P") || play2.equalsIgnoreCase("S")));


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


            do {
                System.out.println("Would you like to continue playing? [Y/N]: ");
                stillPlaying = sc.nextLine();
                if (stillPlaying.equalsIgnoreCase("Y")) {
                    playing = true;
                } else if (stillPlaying.equalsIgnoreCase("N")) {
                    playing = false;
                } else System.out.println("Invalid input! Please only input [Y][N].");
            }
            while (!(stillPlaying.equalsIgnoreCase("Y") || stillPlaying.equalsIgnoreCase("N")));
        }
        while (playing);
        System.out.println("Thank you for playing! :3");
    }
}