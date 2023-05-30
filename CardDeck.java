
public class CardDeck {
  // Two multidimentional arrays one to hold the deck of cards and all the values,
  // the second to hold the cards we have already drawn.
  public static final int[][] cardDeck = new int[13][4];
  public static final int[][] blackList = new int[13][4];

  // METHOD - Fills cardDeck with all the values of a 52 card deck (no jokers)
  public static void populateDeck(){
    int i;
    int j;

    // for loop with embeded for loop and 'i' & 'j' as counters.
    for(i = 0; i <= 12; ++i){
      
      for(j = 0; j <= 3; ++j){

        // value of 'i' will determine the value of the card.
        // value of 'j' will determine the suit.
        cardDeck[i][j] = i + 1;
        cardDeck[i][j] = (cardDeck[i][j] > 10) ? 10: cardDeck[i][j];

        // These values are caught(0, 10, 11, 12) for aces and faces.
        if(i == 0 | i == 10 | i == 11 | i == 12){
          
          switch(i){
            case 0:
              System.out.print("cardDeck["+i+"]["+j+"] = A");
              break;
            case 10:
              System.out.print("cardDeck["+i+"]["+j+"] = J");
              break;
            case 11:
              System.out.print("cardDeck["+i+"]["+j+"] = Q");
              break;
            case 12:
              System.out.print("cardDeck["+i+"]["+j+"] = K");
              break;
            default:
              break;
          }
        } else {
          // Print the position of the card in the array and the value held at that position. (if its not a face card or and ace)
          System.out.print("cardDeck["+i+"]["+j+"] = " + cardDeck[i][j]);
        }

        // Print the suit of the card
        if(j == 0) System.out.println(ConsoleColors.RED_BOLD + ConsoleColors.HEARTS_SUIT + ConsoleColors.RESET);
        if(j == 1) System.out.println(ConsoleColors.BLACK_BRIGHT + ConsoleColors.SPADES_SUIT + ConsoleColors.RESET);
        if(j == 2) System.out.println(ConsoleColors.RED_BOLD + ConsoleColors.DIAMONDS_SUIT + ConsoleColors.RESET);
        if(j == 3) System.out.println(ConsoleColors.BLACK_BRIGHT + ConsoleColors.CLUBS_SUIT + ConsoleColors.RESET);
      }
    }
  }

  // METHOD - Draws card from the cardDeck and make sure its not equal to any of the cards in the blacklist.
  public static void DrawCard(int[][][] hand, int nextCardInHand) { 
    // Set the values of value and suit to random values within the appropriate ranges.
    int value = Main.rand.nextInt(13);
    int suit = Main.rand.nextInt(4);

    // While the values are equal to anything in the blacklist keep randomizing them and checking them.
    while(cardDeck[value][suit] == blackList[value][suit]) {
      value = Main.rand.nextInt(13);
      suit = Main.rand.nextInt(4);
    }

    // When we find a card that is not in the blacklist add it to the black list.
    blackList[value][suit] = cardDeck[value][suit];
    // Add card to hand.
    hand[0][0][nextCardInHand] = value;
    hand[0][1][nextCardInHand] = suit;
  }
}