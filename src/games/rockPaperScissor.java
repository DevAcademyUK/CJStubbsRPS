package games;
//test push to repositorie from college laptop as coulnd't push from home laptop.

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    //setting the class to public meaning its accesible by other classes and can be called upon.
    String playerName;
    String playerMove;
    String computerMove;
    int score;
    Scanner myScanner = new Scanner(System.in);
//the above creates accessible objects and also a scanner which scans for the end users input


    public static void main(String[] args) {
        rockPaperScissor rps = new rockPaperScissor();
        rps.initialiseGame();
    }
/*
public as stated above is open to the class it's within, static means the method is associated with the class and not a
certain object of that class which results in being able to make a static method without creating an object of the class.

rockPaperScissor is reffering to the public class above which then "rps = new" this is creating a new object within
the class then within the object of rps is initialiseGame which is the method which is then defined below!
 */

    private void initialiseGame() {
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame();
    }

    /*Private means it can only be used from within the class in which they are defined.
initaliseGame starts the game and the first commands prints the line to enter your name. following this it sets the
end users input assigns it to the "playerName" playGame links to the method below.
 */
    private void playGame() {
        System.out.println("Enter your move: ");
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove();
        String result = getWinner(playerMove, computerMove);
        if (result.equalsIgnoreCase("Win")) {
            System.out.println("Congratulations, you won this round!");
            score++;
        } else if (result.equalsIgnoreCase("Lose")) {
            System.out.println("You lost this round!");
            score--;
        } else {
            System.out.println("This round was a draw!");
        }

        if (score < 3 && score > -3) {
            playGame();
        } else if (score == 3) {
            System.out.println("Winner Winner!!");
        } else if (score == -3) {
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() {
        Random r = new Random();
        String move = "";
        int i = r.nextInt(3);
        switch (i) {
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove) {
        String outcome = "";
        if (playerMove.equalsIgnoreCase("rock")) {
            if (computerMove.equalsIgnoreCase("rock")) {
                outcome = "Draw";
            } else if (computerMove.equalsIgnoreCase("paper")) {
                outcome = "Lose";
            } else {
                outcome = "Win";
            }
        }
        if (playerMove.equalsIgnoreCase("paper")) {
            if (computerMove.equalsIgnoreCase("rock")) {
                outcome = "Win";
            } else if (computerMove.equalsIgnoreCase("paper")) {
                outcome = "Draw";
            } else {
                outcome = "Lose";
            }
        }
        if (playerMove.equalsIgnoreCase("scissors")) {
            if (computerMove.equalsIgnoreCase("rock")) {
                outcome = "Lose";
            } else if (computerMove.equalsIgnoreCase("paper")) {
                outcome = "Win";
            } else {
                outcome = "Draw";
            }
        }
        return outcome;
    }
}
