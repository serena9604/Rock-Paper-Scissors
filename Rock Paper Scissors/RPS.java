
import java.util.Scanner;
public class RPS
{
    //prints out which choice each player made
    public static void choice (String playerChoice, String computerChoice) {
        System.out.println("You threw " + playerChoice + "!  I thew " + computerChoice + "!");
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
            while (turn != ROCK && turn != PAPER && turn != SCISSORS) {
                System.out.println("What do you throw?  [1] Rock, [2] Paper, [3] Scissors?");
                turn = sc.nextInt();

                if (turn != ROCK && turn != PAPER && turn != SCISSORS){
                    System.out.println("Invalid response. Please try again");
                } 
            }
        }
    }
}
