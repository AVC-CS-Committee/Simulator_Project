import java.util.Scanner;
import java.util.Random;

public class SlotGame {

  double userAccount;
  Scanner scnr;
  Random rand;
  
  public SlotGame(double userAccount, Scanner scnr, Random rand) {
    this.userAccount = userAccount;
    this.scnr = scnr;
    this.rand = rand;
  }

    public void startSlotGame() {

    String input;                // User input
    int S1, S2, S3;              // S1 = slot 1, S2 = slot 2, S3 = slot 3
    int spinTurn = 0;            // Amount of spins player has done.
    double winAmount = 200.00;   // Winnning prize amount.
    double winMultiplier = 1.00; // Multiplies betAmount by this much and rewards userAccount with that amount.
    double betAmount = 5.00;    // How much each spin costs.
    double multAmount = 0.0001;    // Amount that the multiplier increases by.

    System.out.println("Press 'A', 'S', or 'D' to spin the Slot Machine 3000! Try it out and test your luck!\n");
    System.out.println("Press 'r' for the rules.\n");
    System.out.println("Press q to quit anytime.\n");
    System.out.printf("ACCOUNT BALANCE: $%.2f\n", userAccount);
    
    while (true) {

      input = scnr.nextLine();

      //Rules of the game
      if (input.equalsIgnoreCase("r")){
        System.out.println("Press 'A', 'S', or 'D' to spin.\n");
        System.out.println("A - cost per spin: $5.00,  multiplier increase of.001%");
        System.out.println("S - cost per spin: $50.00, multiplier increase of .01%");
        System.out.println("D - cost per spin: $1000.00, multiplier increase of 1%\n");
        System.out.println("In case your an idiot, here's your balance");
        System.out.printf(" ACCOUNT BALANCE: $%.2f\n", userAccount);                
        System.out.println("Otherwise, you will lose money. :(\n"); 
      }
      
      // If Q or q is pressed, you exit the game
      if (input.equalsIgnoreCase("q")) { Main.pauseGame(); Main.clearConsole(); Main.menu();}
      
      if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("s") || input.equalsIgnoreCase("d")) {
        if (input.equalsIgnoreCase("a")) {
          betAmount = 5.00;
          multAmount = 0.0001;
        } 
        else if (input.equalsIgnoreCase("s")) {
          betAmount = 50.00;
          multAmount = 0.001;
        } 
        else if (input.equalsIgnoreCase("d")) {
          betAmount = 1000.00;
          multAmount = 0.01;
        }
        
        Main.checkFunding(betAmount); // Check if user has enough cash to play.
        ++spinTurn;              // Increments spinTurn by 1
        System.out.println("\nCurrent spin: " + spinTurn);
        
        // Randomly generates numbers from 1-9 for all 3 slots
        S1 = rand.nextInt(8) + 1;
        S2 = rand.nextInt(8) + 1;
        S3 = rand.nextInt(8) + 1;

        System.out.println("You spun: " + S1 + " " + S2 + " " + S3);

        // If 3 numbers match
        if ((S1 == S2) && (S1 == S3)) {
          // Switch statement determining prize based on number matched.
          switch(S1) {
            case 1:
              winAmount = 100.10;
              break;
            case 2:
              winAmount = 700.20;
              break;
            case 3:
              winAmount = 33.00;
              break;
            case 4:
              winAmount = 300.00;
              break;
            case 5:
              winAmount = 110.02;
              break;
            case 6:
              winAmount = 30.00;
              break;
            case 7:
              winAmount = 25000.01;
              break;
            case 8:
              winAmount = 888.80;
              break;
            case 9:
              winAmount = 500.50;
              break;
            default:
              break;
          }
          System.out.printf("YOU WIN: $" + "%.2f!\n", (winAmount * winMultiplier));
          Main.winnings(winAmount, winMultiplier); // Give reward to user
          winMultiplier = 1.00;               // Winning multiplier reset.
        } 
        else {
          // Prints out that you lost if the 3 numbers don't match
          System.out.println("You Lose.");
          System.out.println("Lost: $" + betAmount);
          System.out.printf("ACCOUNT BALANCE: $%.2f\n", userAccount);
          winMultiplier += multAmount; // Adds prize multiplier by multiplier amount.
        }
      }
      else {
        // Outputs message if input doesn't equal a, s, or d.
        System.out.println("\nNot a valid option.");
      }
      System.out.println("Press 'A', 'S', or 'D' to spin:"); 
    }
  }
  
}