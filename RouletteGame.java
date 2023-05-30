import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RouletteGame {

    private final int ROW_SIZE = 12;
    private final int COLUMN_SIZE = 3;
    private int[][] rouletteBoard = new int[ROW_SIZE][COLUMN_SIZE];
    private int[][] chipsPlaced = new int[ROW_SIZE][COLUMN_SIZE];

    private int numChips;
    private int i;
    private int j;
    private int boardNum;
    private double betAmount;
    private double accountMoney;

    Random chosenNum = new Random();

    public RouletteGame(double userAccount){
        accountMoney = userAccount;
    }

    private void resetArray() {
        boardNum = 1;
        numChips = 5;
        for (i = 0; i < ROW_SIZE; ++i) {
            for (j = 0; j < COLUMN_SIZE; ++j) {
                rouletteBoard[i][j] = boardNum;
                chipsPlaced[i][j] = 0;
                ++boardNum;
            }
        }
    }

    private void printBoard() {
        System.out.println("___________________");
        for (i = 0; i < ROW_SIZE; ++i) {
            for (j = 0; j < COLUMN_SIZE; ++j) {

                if (chipsPlaced[i][j] == 0) {
                    if (rouletteBoard[i][j] < 10) {
                        System.out.print("|  " + rouletteBoard[i][j] + "  ");
                    } else {
                        System.out.print("|  " + rouletteBoard[i][j] + " ");
                    }
                }
                else{
                    if (chipsPlaced[i][j] == 1) {
                        System.out.print("|  " + ConsoleColors.RED_BOLD + "o" + ConsoleColors.RESET + "  ");
                    }
                    else if (chipsPlaced[i][j] == 2) {
                        System.out.print("|  " + ConsoleColors.RED_BOLD + "oo" + ConsoleColors.RESET + " ");
                    }
                    else if (chipsPlaced[i][j] == 3) {
                        System.out.print("| " + ConsoleColors.RED_BOLD + "ooo" + ConsoleColors.RESET + " ");
                    }
                    else if (chipsPlaced[i][j] == 4) {
                        System.out.print("| " + ConsoleColors.RED_BOLD + "oooo" + ConsoleColors.RESET);
                    }
                    else if (chipsPlaced[i][j] == 5) {
                        System.out.print("|" + ConsoleColors.RED_BOLD + "ooooo" + ConsoleColors.RESET);
                    }
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }


    //CATCH ERROR IF USER DOES NOT ENTER DOUBLE/INT WHEN EXPECTED
    private void placeChip(Scanner scnr) {
    	
    	while(true) {
    	  try {

          System.out.println("Please enter the amount you would like to bet: ");
          betAmount = scnr.nextDouble();
  
          while (betAmount > accountMoney) {
            System.out.printf("You only have $%.2f in your account. Enter a smaller amount!", accountMoney);
            betAmount = scnr.nextDouble();
          }
          while (betAmount <= 0) {
          	System.out.println("You have to bet something. It can't be 0 or less!");
          	betAmount = scnr.nextDouble();
          }
  	      break;
    	  }//End of try
    		
    	  catch(InputMismatchException e) {
    			System.out.println("Fool you can only enter numbers! \n");
    			System.out.println("Re-enter, and get it right!");
    			scnr.nextLine();
    		}
    	}	//End of while(true)
      
    	while(true) {
    		try {
    		
        int chipLocation;

        while (numChips > 0) {
            System.out.println("\nPlease enter a number on which you want a chip: ");
            chipLocation = scnr.nextInt();

            if ((chipLocation <= 36) && (chipLocation >= 1)) {
                --numChips;

                i = getI(chipLocation);
                j = getJ(chipLocation, i);

                ++chipsPlaced[i][j];
              printBoard();
            }

            else {
                System.out.println("You can't put your chip there. Try again!");
            }
        } //End of numChips > 0
    			break;
    		
    }//End of 2nd try
    		catch(InputMismatchException e)	{
    			System.out.println("How many times do I have to tell you?!");
    			System.out.println("You can only enter NUMBERS!");
    			System.out.println("You're so stupid.");
    			System.out.println("Try Again!");
    			scnr.nextLine();
    		}
    		
    	}//End of 2nd while
    }//End of placeChip

    //Methods for getting i and j location in array from a number on the board.
    private int getI(int chipLocation) {
        i = (chipLocation - 1) / 3;
        return i;
    }

    private int getJ(int chipLocation, int i) {
        j = chipLocation - rouletteBoard[i][0];
        return j;
    }

    private void gameWelcome(Scanner scnr) {
        System.out.println();
        System.out.println("*******************~WELCOME TO ROULETTE~*******************");
        System.out.println("    Press \"r\" if you would like to display the rules.");
        System.out.println("Otherwise, you will proceed directly to the game. Have fun!");

        String userInput = scnr.nextLine();
        if(userInput.equals("r")) {
            printRules();
            scnr.nextLine();
        }
    }

    private void printRules() {
        System.out.println();
        System.out.println("**********************~ROULETTE RULES~**********************");
        System.out.println("    You have five chips to place anywhere on the board.");
        System.out.println("         You may place more than one chip on each.");
        System.out.println("   A ball will be rolled and will randomly on one number.");
        System.out.println("   If you have at least one chip on that number, you win!");
        System.out.println(" Your bet amount will be multiplied by the number of chips.");
        System.out.println(" If you do not have a chip on the number, you lose your bet.");
        System.out.println("                         Good Luck!");
    }

    private double rollBall() {
        int ballLocation = chosenNum.nextInt(36) + 1;

        System.out.println("\nThe ball landed on #" + ballLocation + "!");


        i = getI(ballLocation);
        j = getJ(ballLocation, i);

        if(chipsPlaced[i][j] > 0){
            betAmount *= chipsPlaced[i][j];
            System.out.printf("\nYou won $ %.2f!\n", betAmount);
        }
        else {
            System.out.println("\nYou lost. Better luck next time!\n");
            betAmount *= -1;
        }

        return betAmount;
    }

    public double playGame(Scanner scnr) {
        String userInput = "y";

        gameWelcome(scnr);

        while (userInput.equals("y")) {
            resetArray();
            printBoard();
            placeChip(scnr);

            scnr.nextLine(); // Clearing the newlines from the placeChip scnr.nextInt() calls.

            System.out.println("Press enter to roll the ball!");
            scnr.nextLine();
            accountMoney += rollBall();

            System.out.printf("\nYou have $%.2f.\n", accountMoney);
            System.out.println("Would you like to play again? Enter \"y\" for yes.");
            userInput = scnr.nextLine();
        }

        return accountMoney;
    }
}
