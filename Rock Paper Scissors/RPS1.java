
import java.util.Scanner;

public class RPS1
{
    //prints out which choice each player made
    public static void choice (String playerChoice, String computerChoice) {
        System.out.println("You threw " + playerChoice + "!  I thew " + computerChoice + "!");
    }

    //output if player wins
    public static void victory() {
        System.out.println("Whaaa?? ... You beat me?  RAGE!");
        System.out.println("");
    }

    //output if player and computer tie
    public static void tie(){
        System.out.println("A draw ... pretty good, human!  I demand a rematch ...");
        System.out.println("");
    }

    //output if player loses
    public static void loss() {
        System.out.println("I win!  You are not a challenge for me ...");
        System.out.println("");
    }

    public static void main (String args[]) {
        //variables
        Scanner sc = new Scanner(System.in);
        String ans = "y";
        int turn = 0;
        int computerTurn = 0;
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;
        int win = 0;
        int loss = 0;
        int tie = 0;

        //begin loop    
        while (ans.equals("y")){           
            System.out.println("Good luck human...");
            System.out.println("");

            while (turn != ROCK && turn != PAPER && turn != SCISSORS) { //loops until player makes valid choice
                System.out.println("What do you throw?  [1] Rock, [2] Paper, [3] Scissors?"); //player turn
                turn = sc.nextInt();

                if (turn != ROCK && turn != PAPER && turn != SCISSORS){  //prevents invalid answers 
                    System.out.println("Invalid response. Please try again");
                    System.out.println("");
                } 

            } 

            computerTurn = (int) (Math.random()*3) + 1; //computer makes turn

            //determine who wins
            //player victories
            if (turn == ROCK && computerTurn == SCISSORS) {
                choice("rock", "scissors");
                victory();
                win ++;
            } else if (turn == PAPER && computerTurn == ROCK) {
                choice("paper", "rock");
                victory();
                win ++;
            } else if (turn == SCISSORS && computerTurn == PAPER) {
                choice("scissors", "paper");
                victory();
                win ++;
            }

            //player-computer ties
            if (turn == ROCK && computerTurn == ROCK) {
                choice("rock", "rock");
                tie();
                tie ++;
            } else if (turn == PAPER && computerTurn == PAPER) {
                choice("paper", "paper");
                tie();
                tie ++;
            } else if (turn == SCISSORS && computerTurn == SCISSORS) {
                choice("scissors", "scissors");
                tie();
                tie ++;
            }

            //player losses
            if (turn == ROCK && computerTurn == PAPER) {
                choice("rock", "paper");
                loss();
                loss ++;
            } else if (turn == PAPER && computerTurn == SCISSORS) {
                choice("paper", "scissors");
                loss();
                loss ++;
            } else if (turn == SCISSORS && computerTurn == ROCK) {
                choice("scissors", "rock");
                loss();
                loss ++;
            }

            //asks if player wants to play again
            System.out.println("Play again? [Y,N]");
            ans = sc.next();
        }
        if ("ans".equals("n")
    }
}

