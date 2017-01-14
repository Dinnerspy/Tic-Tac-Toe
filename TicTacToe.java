/*
* Nicholas Ouellette 3556762
*cs1073 Assignment 7, question 1
* created November 9 2016
*
*purpose: A two player game of tictactoe
*input: int to place user marker
*output: gird showing the marks
*
*/
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        boolean GameOver, RoundOver, player1, player2;
        String UserInput;

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe.\n\nThis is a player vs player version.");

        System.out.println("Please Type Y if you have a second player or are willing to play \nyourself otherwise type N.");
        UserInput = myscanner.nextLine();

        while (!UserInput.equalsIgnoreCase("y") && !UserInput.equalsIgnoreCase("n")) {

            System.out.println("Please Type Y or N only.");
            UserInput = myscanner.nextLine();

        }

        if (UserInput.equalsIgnoreCase("Y")) {

        } else {
            return;
        }

        System.out.println("In order to place you mark type the number corespnoding "
                + "to the spot you want.");
        System.out.println("1\t2\t3\t\n4\t5\t6\n7\t8\t9\t");
        Board Players = new Board();
        player2 = true;
        player1 = true;
        GameOver = false;
        RoundOver = false;
        //runs the games
        while (GameOver == false) {

            while (RoundOver == false) {
                        //players one turn
                while (player1 == true) {
                

                    System.out.println("Player ones turn");
                    UserInput = myscanner.nextLine();
                        //checks if can be place
                    while (!UserInput.equalsIgnoreCase("1") && !UserInput.equalsIgnoreCase("2")
                            && !UserInput.equalsIgnoreCase("3") && !UserInput.equalsIgnoreCase("4")
                            && !UserInput.equalsIgnoreCase("5") && !UserInput.equalsIgnoreCase("6")
                            && !UserInput.equalsIgnoreCase("7") && !UserInput.equalsIgnoreCase("8")
                            && !UserInput.equalsIgnoreCase("9")) {

                        System.out.println("a number 1 to 9.");
                        UserInput = myscanner.nextLine();

                    }

                    while (Players.validatePlacement(UserInput) == false) {

                        System.out.println("Sorry that pont is taken please use one that is not");
                        UserInput = myscanner.nextLine();

                        while (!UserInput.equalsIgnoreCase("1") && !UserInput.equalsIgnoreCase("2")
                                && !UserInput.equalsIgnoreCase("3") && !UserInput.equalsIgnoreCase("4")
                                && !UserInput.equalsIgnoreCase("5") && !UserInput.equalsIgnoreCase("6")
                                && !UserInput.equalsIgnoreCase("7") && !UserInput.equalsIgnoreCase("8")
                                && !UserInput.equalsIgnoreCase("9")) {

                            System.out.println("a number 1 to 9.");
                            UserInput = myscanner.nextLine();

                        }

                    }
                    Players.putX(UserInput);
                    Players.printPlayingBoard();
                    if (Players.CheckerX() == true) {

                        System.out.println("Player one wins");
                        player1 = false;
                        player2 = false;
                        RoundOver = true;
                    } else {

                        player1 = false;
                        player2 = true;
                    }
                }//player twos turn
                while (player2 == true) {    
                    if (Players.TieChecker() == true) {
                        Players.printPlayingBoard();
                        System.out.println("It is a tie");
                        player1 = false;
                        player2 = false;
                        RoundOver = true;
                        break;

                    }
                    System.out.println("Player 2 turn.");

                    UserInput = myscanner.nextLine();

                    while (Players.validatePlacement(UserInput) == false) {

                        System.out.println("Sorry that pont is taken please use one that is not");
                        UserInput = myscanner.nextLine();

                        while (!UserInput.equalsIgnoreCase("1") && !UserInput.equalsIgnoreCase("2")
                                && !UserInput.equalsIgnoreCase("3") && !UserInput.equalsIgnoreCase("4")
                                && !UserInput.equalsIgnoreCase("5") && !UserInput.equalsIgnoreCase("6")
                                && !UserInput.equalsIgnoreCase("7") && !UserInput.equalsIgnoreCase("8")
                                && !UserInput.equalsIgnoreCase("9")) {

                            System.out.println("a number 1 to 9.");
                            UserInput = myscanner.nextLine();

                        }
                    }
                    Players.putO(UserInput);
                    Players.printPlayingBoard();
                    if (Players.CheckerX() == true) {
                        Players.printPlayingBoard();
                        System.out.println("Player two wins");
                        player1 = false;
                        player2 = false;
                        RoundOver = true;
                    } else {

                        player1 = true;
                        player2 = false;
                    }

                }
            }//ask if we want to play again
            System.out.println("Play Again? Y or N?");
            UserInput = myscanner.nextLine();

            while (!UserInput.equalsIgnoreCase("y") && !UserInput.equalsIgnoreCase("n")) {

                System.out.println("Please Type Y or N only.");
                UserInput = myscanner.nextLine();

            }
            if (UserInput.equalsIgnoreCase("y")) {
                Players.reset();
                RoundOver = false;
                break;
            } else {
                GameOver = true;
            }

        }
    }

}
