/*
Project Lead: Samuel Segovia
Authors: Samuel Segovia, Cristian Herrera, Angelica Holley coded more than Frances Kaufmann, Peter, Bryan Abrego, Logan Sanchez, Nicholas Gallagher, Harvey Freeman
Contributions:  Deepak_spdeepak-ConsoleColors.java, How to check if a String is numeric in Java - Stack Overflow
https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
Project Name: Simulator_Project
Creation Date: 10/21/2022
Completion Date: 
Description: 

---------------------------------------------------------------
Current Progress:
  - Overall game polish / Counting game - Samuel
  - Roulette/ counting animations - Samuel
  - Ending prompt statements - Angelica ,David 
  - Ending ascii art - Angelica, Natalia
  - Loanshark mechanic - Sebastian, Harvey (limit of 3 tries) 
  - Rules for games - Harvey
  - Title Screen - 
  - Separating games into classes - Sebastian, Peter
---------------------------------------------------------------
Possible Additions:
  * 
---------------------------------------------------------------
***EDITORS NOTE FOR PRESENTING THE PROJECT***
- When presenting the project:
  - Keep zoom at 100% and hide console to make the code presentable.
  - Drag Console window to the side when presenting code.
  - Keep zoom at 100% to make the console presentable.
  - Press "Maximize" on the top right corner of the console when running the code.
---------------------------------------------------------------
*/

// Imported libraries
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
  
// GLOBAL CLASS VARIABLES (Affect the entire main class)
public static Scanner scnr = new Scanner(System.in); // Allows input.
public static Random rand = new Random();            // Allows random number generator.
public static double userAccount = 100.0;            // Starting cash amount.
public static boolean loanTaken = false;             // Boolean for checking if loan was taken

  String name = new String();
	      Main (String newName) { 
	      if(newName.length() > 0){
	       this.name = newName;
	       }
        }
//=======================================================================
//=======================================================================
//                              MAIN METHOD
  
  public static void main(String[] args) {
    
    clearConsole();                                  // Clears screen.
    System.out.print("S" + ConsoleColors.RED_BOLD + ConsoleColors.HEARTS_SUIT + ConsoleColors.RESET);
    System.out.print("T" + ConsoleColors.BLACK_BRIGHT + ConsoleColors.SPADES_SUIT + ConsoleColors.RESET);
    System.out.print("E" + ConsoleColors.RED_BOLD + ConsoleColors.DIAMONDS_SUIT + ConsoleColors.RESET);
    System.out.print("M" + ConsoleColors.BLACK_BRIGHT + ConsoleColors.CLUBS_SUIT + ConsoleColors.RESET);
    System.out.println(" Club Presents: Casino_Simulator"); 
    System.out.println("\n\nPress enter to start:"); // Prompts user to press enter.
    scnr.nextLine();                                 // Input for pressing enter.
    clearConsole();                                  // Clears screen.
    introPrompt();                                   // Prints out intro prompt before menu.
    menu();                                          // Calls menu method.
    
  } // End of Main
  
//=======================================================================
//=======================================================================
//                              Intro Prompt
  
 public static void introPrompt() {

System.out.println("It was a long and tiring day at Antelope Valley College, and the STEM Club meeting made it even longer. So, naturally, you fell asleep... \nAfter waking up, you find that you are no longer in a STEM Club meeting... but a gazino?!");
System.out.println("\n\nPress enter to continue:"); 
scnr.nextLine();

   
System.out.println("WELCOOOOOOOOOOOOOOOOMEE TO THE UNDERGROUND STEM CLUB GAZINO!! PLEASE, JOIN US AND LET LOOSE! PLAY SOME GAMES!\"");

owner.neutralFace();

System.out.println("\n\nPress enter to join and play some games:"); 
scnr.nextLine(); // Leaves the question up until user presses enter.
 
clearConsole();
 }
  
//=======================================================================
//=======================================================================
//                              MAIN MENU
  
  public static void menu() {
    
    // Integer for user input.
    Integer input = 0;

    // Menu Options
    System.out.println("Select an option:");
    System.out.println("1. Guess-a-Number");
    System.out.println("2. Slot Machine");
    System.out.println("3. Counting to 21");
    System.out.println("4. Roulette Game");
    System.out.println("5. Leave gazino");
    System.out.printf("\nACCOUNT BALANCE: $" + "%.2f\n",userAccount);

    // If user input is not within range of our menu options, keep asking for input.
    do {
      // Assign input to text variable.
      String text = scnr.nextLine();

      // Attempts to turn string into an integer.
      try {
        input = Integer.parseInt(text);
      }
        
      // Throws error message if string can't be turned into an integer
      catch (NumberFormatException e) {  
        System.out.println("You must enter an integer that corrosponds to a menu item.");
      }

      // Check if the input was in the right range if integer conversion was successful
      // If not in range throw a error message.
      if(input < 1 | input > 5){
        System.out.println("Not a valid option");
        System.out.println("Please enter a number between 1 and 6");
      }

    // While the input is not in range of the menu repeat the loop.  
    } while(input < 1 | input > 5);

    /* 
    * Game menu switch.
    * The switch takes the user's input as the expression.
    * The switch will perform the actions inside the case that matches the expression.
    * If there is no case that the expression fits then default is called.
    */
    switch(input) {
      case 1:
        // Starts guessing game.
        Animations.guessAnimator();
        RandomNumberGame newRanNumGame = new RandomNumberGame(userAccount, scnr, rand);
        newRanNumGame.startRandNumGame();
        //randNumberGame();
        break;
      case 2:
        // Starts slot machine game.
        Animations.slotAnimator();
        // SlotGame newSlotGame = new SlotGame(userAccount, scnr, rand);
        // newSlotGame.startSlotGame();
        slotGame();
        break;
      case 3:
        // Starts counting game.
        countingGame();
        break;

      case 4:
        //Roulette game
        Animations.guessAnimator();
        RouletteGame newGame = new RouletteGame(userAccount);
        userAccount = newGame.playGame(scnr);
        pauseGame();
        clearConsole();
        menu();
        break;
        
      case 5:
        // Exits game.
       clearConsole();
       endingPrompt(userAccount);
        if (loanTaken && userAccount < 10000.0) {
          System.out.println("As you leave the gazino... you hear someone run rapidly towards you...");
          System.out.println("\"HEY! WHERE ARE YOU GOING? YOU STILL OWE US MONEY\".");
          System.out.println("You failed to pay back the loan sharks! You now have to work for the rest of your life to repay your debt!");
        }
        
        System.out.println("\"Thanks For Playing!\"");
        owner.neutralFace();
          
        System.exit(0);
        break;
      default:
        break;
    }
  }
  
//=======================================================================
//=======================================================================
//                              GUESS-A-NUMBER
  
  // public static void randNumberGame() {
    
  //   String input;                // User input
  //   Integer guess = 0;           // User's guessed number
  //   Integer correctNum;          // Randomly generated number
  //   double winAmount = 200.00;   // Winnning prize amount
  //   double winMultiplier = 1.00; // Multiplies betAmount by this much and rewards userAccount with that amount.
  //   double betAmount = 5.0;      // How much each spin costs.

  //   System.out.println("Welcome to the Random Number game!\n");
  //   System.out.println("Press 'r' for the rules.\n");
  //   System.out.println("Press 'q' to quit anytime you idiot.");
  //   System.out.println("Winning Prize: $200.00  |  Prize multiplier added per spin: 0.01");
  //   System.out.println("1 spin: $5.00");
  //   System.out.println("ACCOUNT BALANCE: $" + userAccount + "\n");
  //   System.out.println("Enter a number:");

  //   while (true) {
  //     // Asks for input for number you want to guess
  //     input = scnr.nextLine();

  //     //Rules of the game
  //     if (input.equalsIgnoreCase("r")){
  //       System.out.println("Guess any number between 1-100.\n");
  //       System.out.println("If you guess correctly, cash money will be added to your account.\n");
  //       System.out.println("Otherwise, you will lose money. :(");
  //     }
      
  //     // If Q or q is pressed, you exit the game
  //     if (input.equalsIgnoreCase("q")) {        
  //       pauseGame();    // Pause then clear the console.       
  //       clearConsole(); // Clean the console.
  //       menu();         // Go back to menu. 
  //     } 

  //     // Attempts to turn string into an integer.
  //      try {  
  //       guess = Integer.parseInt(input);
  //     }

  //     // Throws error message if string can't be turned into an integer
  //     catch (NumberFormatException e) { 
  //       System.out.println("\nNot a valid option.");
  //     } 

  //     // Checks if user has enough cash to play.
  //       checkFunding(betAmount);
          
  //     // Accepts input only if input is from 1-100
  //     if (isNumeric(input) && guess > 0 && guess < 101) {             

  //       System.out.print("\nYour guess: ");

  //       // Randomly generates coorectNum to 1 to 100
  //       correctNum = rand.nextInt(100) + 1;
      
  //       // Prints out Win statement if input equals the correct random number
  //       if (input.equals(correctNum.toString())) {
  //         System.out.println("CORRECT!\n");
  //         System.out.printf("YOU WON: $" + "%.2f\n", (winAmount * winMultiplier));
  //         winnings(winAmount, winMultiplier); // Give reward to user.
  //         winMultiplier = 1.00;               // Winning multiplier reset.
  //       }   
  //       else {
  //         // Prints out incorrect if input doesn't equal the correct random number
  //         System.out.println("WRONG! Number was: " + correctNum);
  //         System.out.println("Lost: $" + betAmount);
  //         System.out.printf("ACCOUNT BALANCE: $%.2f\n", userAccount);
  //         winMultiplier += 0.01; // Adds prize multiplier by 0.01.
  //       }
  //     } 
  //     else {
  //       // Outputs message if guess isn't from 1-100
  //       System.out.println("\nYou must enter an integer that is from 1-100.");
  //     }  
  //     System.out.println("Enter a number:");     
  //   }
  // }

//=======================================================================
//=======================================================================
                             // SLOT MACHINE

  public static void slotGame() {

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
      if (input.equalsIgnoreCase("q")) { pauseGame(); clearConsole(); menu();}
      
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
        
        checkFunding(betAmount); // Check if user has enough cash to play.
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
          winnings(winAmount, winMultiplier); // Give reward to user
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

//=======================================================================
//=======================================================================
//                              BLACK JACK
  
  public static void blackJackGame() {
    String input;
    //int winMultiplier = 10; // Multiplies betAmount by this much and rewards userAccount with that amount.
    double betAmount = 5.0; // How much each spin costs.
    int[][][] hand = new int[2][2][14];
    int nextCardInHand = 0;
    int i;

    // Sets every spot in the 3D array to -1. If the spot is -1 when the for loop is running it exits.
    // A spot in the hand array equal to -1 lets us know that spot is empty.
    for (int[][] row : hand) {
      for (int[] rowColumn : row) {
          Arrays.fill(rowColumn, -1);
      }
    }
    
    CardDeck.populateDeck();
    
    pauseGame();
    
    clearConsole();

    while(true) {
        
      System.out.println("Enter 'd' to deal hand, enter 'q' to Return to the Menu.");
      
      input = scnr.nextLine();
    
      if (input.equalsIgnoreCase("q")) {        
        // Pause then clear the console.
        pauseGame();
    
        // Clean the console.
        clearConsole();
        
        // Go back to menu. 
        menu();
      } 
    
      checkFunding(betAmount); // Check if user has enough cash to play.
    
      if(input.equalsIgnoreCase("d") && nextCardInHand != 14) {

        // Draws a random card from a random suit, will not be a card that was already drawn
        CardDeck.DrawCard(hand, nextCardInHand);
        
        ++nextCardInHand;
      }

      for(i = 0; i < 14; ++i) {
        int value = hand[0][0][i];
        // Catch the values(0, 10, 11, 12) that represent aces and face cards.
        if(value == 0 | value == 10 | value == 11 | value == 12){
          switch(value) {
            case 0:
              System.out.print("card #" + (i+1)+ " = A");
              break;
            case 10:
              System.out.print("card #" + (i+1)+ " = J");
              break;
            case 11:
              System.out.print("card #" + (i+1)+ " = Q");
              break;
            case 12:
              System.out.print("card #" + (i+1)+ " = K");
              break;
            default:
              break;
          }
        } else if(value == -1) {
          break;
        } else {
          // Values between 1 and 9 don't need to be caught.
          // Just prints the current card drawn
          System.out.print("card #" + (i+1)+ " = " + hand[0][0][i]);
        }

        // Print the suit of the card.
        if(hand[0][1][i] == 0) System.out.println(ConsoleColors.RED_BOLD + ConsoleColors.HEARTS_SUIT + ConsoleColors.RESET);
        if(hand[0][1][i] == 1) System.out.println(ConsoleColors.BLACK_BRIGHT + ConsoleColors.SPADES_SUIT + ConsoleColors.RESET);
        if(hand[0][1][i] == 2) System.out.println(ConsoleColors.RED_BOLD + ConsoleColors.DIAMONDS_SUIT + ConsoleColors.RESET);
        if(hand[0][1][i] == 3) System.out.println(ConsoleColors.BLACK_BRIGHT + ConsoleColors.CLUBS_SUIT + ConsoleColors.RESET);
      } 
    }
  }

//=======================================================================
//=======================================================================
//                              COUNTING GAME 
  
  public static void countingGame() {

    Integer input; // User input
    Integer opponentNum; // AI player's number
    Integer totalNum = 1; // Number that will be added throughout game
    Integer winner = 0;
    double winAmount = 200.00;   // Winnning prize amount.
    double winMultiplier = 1.00; // Multiplies betAmount by this much and rewards userAccount with that amount.
    double betAmount = 5.00;    // How much each spin costs.
    double multAmount = 0.0001;    // Amount that the multiplier increases by.
    
    clearConsole();
    System.out.println("Welcome to Counting to 21!\n");
    System.out.println("Press 'r' for the rules.");
    System.out.println("Press 'q' to quit");
    
    System.out.println("First to 21 wins!");
    System.out.printf("ACCOUNT BALANCE: $%.2f\n", userAccount);
    

    
    System.out.println("Current Number: " + totalNum + "\n");   
    System.out.println("Enter 1,2,or 3 to add the number by it: ");
    input = scnr.nextInt();

    while(true) {
      //Rules of the game.
            
      
      if(input < 1 || input > 3) {
        invalidNumber();
        System.out.println("Enter 1,2,or 3 to add the number by it: ");
        input = scnr.nextInt();
      }
      else {
      totalNum += input;
        break;
      }
    }
    
    
    while(input < 21) {
      clearConsole();
      System.out.println("Current Number: " + totalNum + "\n");
      System.out.println("Opponent is choosing their number...");
      Animations.frameFlush(20);

      opponentNum = rand.nextInt(3) + 1;
      totalNum += opponentNum;

      if(totalNum >= 21) {
        totalNum = 21;
        winner = 2;
        break;
      }

      clearConsole();
      System.out.println("Current Number: " + totalNum + "\n");
      System.out.println("Enter 1,2,or 3 to add the number by it: ");
      input = scnr.nextInt();
      
      while(true) {
        if(input < 1 || input > 3) {
          invalidNumber();
          System.out.println("Enter 1,2,or 3 to add the number by it: ");
          input = scnr.nextInt();
        }
        else {
          totalNum += input;
          break;
        }
      }

      if(totalNum >= 21) {
        totalNum = 21;
        winner = 1;
        break;
      }
    }

    clearConsole();
    System.out.println("Current Number: " + totalNum + "\n");
    if (winner == 1) {
      System.out.println("You win!!! ");
    }
    else if(winner == 2) {
      System.out.println("Opposing player wins!!!");
      System.out.println("loser!");
    } 
  }

//=======================================================================
//=======================================================================
//                              ENDING PROMPT 
public static void endingPrompt (double endingAmount) {
  System.out.printf("You walk away with $" + "%.2f\n",userAccount);
  
  if (endingAmount < 0) {
    System.out.println("");

  } else if (endingAmount == 0) {
    System.out.println("Youre broke. Great job, you gambled away all your scholarship and tuition money. You are a living disappointment.");
    
    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿                          ⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿                            ⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿                              ⣿⣿⣿⣿"); 
    System.out.println("⣿⣿         ⣿              ⣿        ⣿⣿⣿⣿"); 
    System.out.println("⣿⣿                                 ⣿⣿");
    System.out.println("⣿⣿                                 ⣿⣿⣿");
    System.out.println("⣿⣿⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿           ⣿⣿⣿⣿"); 
    System.out.println("⣿⣿⣿⣿        ⣿          ⣿          ⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿                           ⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿                       ⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿                  ⣿⣿⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿"); 
  }
 
   else if (endingAmount > 0 && endingAmount < 100) {
    System.out.println("Congratulations, Failure! You gambled away your life savings. And all you have to show for it is $" + endingAmount + ". You can't feed your kids, and CPS took them away." );
  }

   else if (endingAmount > 99 && endingAmount < 1000 ) {
    System.out.println("");
  }

  else if (endingAmount > 999 && endingAmount < 10000 ) {
    System.out.println("Woo hoo! You made $" + endingAmount + ". You decide afterwards to celebrate with a party at the best place ever for making $" + endingAmount +". Olive Garden! ");
    scnr.nextLine();
    System.out.println("You meet the shortie of your dreams and with your extensive finances start a wonderful months long relationship with her.");
    scnr.nextLine();
    System.out.println("But then Uncle Sam started blowin up yo phone sayn 'pay me what you owe me!''Don't act like you forgot!' ");
    scnr.nextLine();
    System.out.println("After payin yo dues to society,(prison for tax evasion). You find out your girl was cheating on you.");
    scnr.nextLine();
    System.out.println("You decide to be like Sean Kingston did and your last though is you shouldn't have gambeled.\n");
    scnr.nextLine();
    System.out.println("Because it made you a FAILURE at relationships!");
      
  }

  else if (endingAmount > 9999 && endingAmount < 100000 ) {
    System.out.println("You're still rich, keep it up");
    System.out.println("");
  }

    else if (endingAmount > 99999) {
    System.out.println("Congratulations");
    System.out.println("");  
    System.out.println("");  
  }
   
}


  
//=======================================================================
//=======================================================================
//                              OTHER FUNCTIONS 



  // METHOD - invalidNumber: Prints out invalid number when input is incorrect.
  public static void invalidNumber() {
    System.out.println("\nInvalid Number, try again!");  
  }
  
  // METHOD - clearConsole: Clears the screen
  public static void clearConsole() {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }

  // METHOD - pauseGame: Pauses game. Int peram determins pause duration.
  public static void pauseGame() {
    System.out.println("\nPress Enter..");
    scnr.nextLine();
  }
  
  // METHOD - checkFunding: Checks if the user has enough cash to play.
  public static void checkFunding(double bet) {
    
    Boolean funded = null; // Sets boolean value to null

    // Conditional Expression: sets bool according to the bet being lower or equal to userAccount.
    funded = (bet <= userAccount) ? true: false;

    // If funded is false then kick them out.
    if(!funded) {
       clearConsole(); 
    
      // Check if the loan has already been taken
      if (loanTaken) {
        System.out.println("So, you think you're a wise guy huh?");
	        scnr.nextLine();
	        System.out.println("You thought you could get one over on our boss eh?");
	        scnr.nextLine();
	        System.out.println("Well let me tell you somethin");
	        scnr.nextLine();
	        System.out.println("BIG BOSS TYLER, DOENSN'T LIKE CARPET-BAGGERS!!!");
	        scnr.nextLine();
	        System.out.println("So I'm gonna teach you a lesson.");
	        scnr.nextLine();
	        System.out.println("SAY HELLO TO MY LITTLE FRIEND...");
	        scnr.nextLine();
	        	String newName = null;
	    	  	  Main test = new Main( newName);
        //System.exit(0);
      }
  
      // If the user takes the loan
      if (loanShark()) {
        userAccount = 1000.0;
      }
      else {
        System.out.println("You're Broke, But Thanks For Playing!\nNow Get Out Before I Call Security..."); 
        System.exit(0);
      }
    }

    // If otherwise true, subtracts bet from userAccount.
    userAccount -= bet;
  }
   // METHOD - loanShark: returns true if the user accepts the loan, false if the user doesn't
  public static boolean loanShark() {
    boolean validInput = false;
    String input;
    
    System.out.println("Hey buddy... I noticed that you are broke. Would you like to take a loan from our company? \nI run a company called Loan Sharks and we offer competitive loans at very high interest rates! The higher the better! \nI'm feeling generous so we'll offer you $1,000 as long as you give us $10,000 back before you leave the gazino. Should be pretty easy for someone of your skill. \nWhat do you say? (Y/N)");

    while(!validInput) {
      input = scnr.nextLine();

      if (input.equalsIgnoreCase("y")) {
        // Take the loan
        System.out.println("Here's your $1000! Do not disappoint us.");
        loanTaken = true;
        return true;
      }
      else if (input.equalsIgnoreCase("n")) {
        // Don't take the loan
        System.out.println("You should've taken our loan.");
        return false;
      }
    }

    // Default case I guess
    return false;
  }
 
  
  // METHOD - winnings: call with prize amount and multiplier of your game to reward player for winning.
  public static void winnings(double prize, double multiplier) {   
    double wins = 0.0;                                              // Sets wins to 0.
    wins = prize * multiplier;                                      // Mutliplies prize by multiplyer
    userAccount += wins;                                            // Adds wins to userAccount
    System.out.printf("ACCOUNT BALANCE: $" + "%.2f\n",userAccount); // Outputs winnings.
  }

  // METHOD - isNumeric: checks if string inputted is a number.
  public static boolean isNumeric(String str) {
    return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
  }
  
//=======================================================================
//=======================================================================
//                         PROMPT SUGGESTIONS
/*
For amount <= 0: You broke n
For amount >99 and <999: Ur mom
for amount == 8888: casdcjklnfgjklasdnfjklasdh kjash dfl
For amount < 0: have the monopoly man arrest people if they end up stealing money or run out of money
"YOU'RE GOING TO JAIL BOY!"









*/
//=======================================================================
//=======================================================================
} // End of MAIN CLASS

/*
 * System.out.println("Hello world!");
 * 
 * System.out.println("Hello wold 2 Electric Boogaloo");
 * 
 * System.out.println("Self destructing in  3... 2... 1...");
 */

/*
 * import java.util.concurrent.TimeUnit;
 * 
 * System.out.println("Something"); // Prompts user to press enter to go to next
 * question
 * continueEnter = scnr.nextLine();
 * 
 * long startTime = System.nanoTime();
 * 
 * /* … The code being measured starts …
 */

// sleep for 5 seconds
// TimeUnit.SECONDS.sleep(5);

/*
 * … The code being measured ends …
 * 
 * long endTime = System.nanoTime();
 * 
 * // get the difference between the two nano time valuess
 * long timeElapsed = endTime - startTime;
 * 
 * System.out.println("Something2"); // Prompts user to press enter to go to
 * next question
 * continueEnter = scnr.nextLine();
 */