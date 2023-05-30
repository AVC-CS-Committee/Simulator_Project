import java.util.Scanner;
import java.util.Random;
//=======================================================================
//=======================================================================
//                              GUESS-A-NUMBER

 public class RandomNumberGame {

    double userAccount;
    Scanner scnr;
    Random rand;

    public RandomNumberGame(double userAccount, Scanner scnr, Random rand){
      this.userAccount = userAccount;
      this.scnr = scnr;
      this.rand = rand;
    }

     public void startRandNumGame(){

       String input;                // User input
       Integer guess = 0;           // User's guessed number
       Integer correctNum;          // Randomly generated number
       double winAmount = 200.00;   // Winnning prize amount
       double winMultiplier = 1.00; // Multiplies betAmount by this much and rewards userAccount with that amount.
       double betAmount = 5.0;      // How much each spin costs.
  
       System.out.println("Guess a random number from 1-100. Press q to quit anytime you idiot.");
       System.out.println("Winning Prize: $200.00  |  Prize multiplier added per spin: 0.01");
       System.out.println("1 spin: $5.00");
       System.out.println("ACCOUNT BALANCE: $" + userAccount + "\n");
       System.out.println("Enter a number:");
  
         while (true) {
         // Asks for input for number you want to guess
         input = scnr.nextLine();
        
         // If Q or q is pressed, you exit the game
         if (input.equalsIgnoreCase("q")) {        
           Main.pauseGame();    // Pause then clear the console.       
           Main.clearConsole(); // Clean the console.
           Main.menu();         // Go back to menu. 
         } 
  
         // Attempts to turn string into an integer.
          try {  
           guess = Integer.parseInt(input);
         }
  
         // Throws error message if string can't be turned into an integer
         catch (NumberFormatException e) { 
           System.out.println("\nNot a valid option.");
         } 
  
         // Checks if user has enough cash to play.
           Main.checkFunding(betAmount);
            
         // Accepts input only if input is from 1-100
         if (Main.isNumeric(input) && guess > 0 && guess < 101) {             
  
           System.out.print("\nYour guess: ");
  
           // Randomly generates coorectNum to 1 to 100
           correctNum = rand.nextInt(100) + 1;
        
           // Prints out Win statement if input equals the correct random number
           if (input.equals(correctNum.toString())) {
             System.out.println("CORRECT!\n");
             System.out.printf("YOU WON: $" + "%.2f\n", (winAmount * winMultiplier));
             Main.winnings(winAmount, winMultiplier); // Give reward to user.
             winMultiplier = 1.00;               // Winning multiplier reset.
           }   
           else {
             // Prints out incorrect if input doesn't equal the correct random number
             System.out.println("WRONG! Number was: " + correctNum);
             System.out.println("Lost: $" + betAmount);
             System.out.printf("ACCOUNT BALANCE: $%.2f\n", userAccount);
             winMultiplier += 0.01; // Adds prize multiplier by 0.01.
           }
         } 
         else {
           // Outputs message if guess isn't from 1-100
           System.out.println("\nYou must enter an integer that is from 1-100.");
         }  
         System.out.println("Enter a number:");     
       }
     }
 }
 
    