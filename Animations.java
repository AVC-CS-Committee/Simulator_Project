import java.util.concurrent.TimeUnit;

public class Animations {
  // Create frame by frame animations for guessing game intro.
  public static void guessAnimator(){
    
    int i;
    
    Main.clearConsole();

    for(i = 0; i <= 2; ++i){

      System.out.println(ConsoleColors.PURPLE_BRIGHT + "            ________          " + ConsoleColors.RED_BRIGHT + "          ______x__          " + ConsoleColors.ORANGE_BRIGHT + "          ________           ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "        _||||||||||||||_      " + ConsoleColors.PURPLE_BRIGHT + "      _||||||||||||||_      " + ConsoleColors.RED_BRIGHT + "      _||||||||||||||_       ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "      _||||||-    -||||||_    " + ConsoleColors.BLUE_BRIGHT + "    _||||||-    -||||||_    " + ConsoleColors.PURPLE_BRIGHT + "    _||||||-    -||||||_     ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "     ||||            ||||||   " + ConsoleColors.CYAN_BRIGHT + "   ||||            ||||||   " + ConsoleColors.BLUE_BRIGHT + "   ||||            ||||||    ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "      ||               |||||  " + ConsoleColors.YELLOW_BRIGHT + "    ||               |||||  " + ConsoleColors.CYAN_BRIGHT + "    ||               |||||   ");
      System.out.println(ConsoleColors.RED_BRIGHT + "                       |||||  " + ConsoleColors.ORANGE_BRIGHT + "                     |||||  " + ConsoleColors.YELLOW_BRIGHT + "                     |||||   ");
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "                       |||||  " + ConsoleColors.RED_BRIGHT + "                     |||||  " + ConsoleColors.ORANGE_BRIGHT + "                     |||||   ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "                    _||||||   " + ConsoleColors.PURPLE_BRIGHT + "                  _||||||   " + ConsoleColors.RED_BRIGHT + "                  _||||||    ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "                 _||||||      " + ConsoleColors.BLUE_BRIGHT + "               _||||||      " + ConsoleColors.PURPLE_BRIGHT + "               _||||||       ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "               ||||||         " + ConsoleColors.CYAN_BRIGHT + "             ||||||         " + ConsoleColors.BLUE_BRIGHT + "             ||||||          ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "              |||||           " + ConsoleColors.YELLOW_BRIGHT + "            |||||           " + ConsoleColors.CYAN_BRIGHT + "            |||||            ");
      System.out.println(ConsoleColors.RED_BRIGHT + "             |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||            " + ConsoleColors.YELLOW_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "             |||||            " + ConsoleColors.RED_BRIGHT + "           |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "             |||||            " + ConsoleColors.PURPLE_BRIGHT + "           |||||            " + ConsoleColors.RED_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "              |||             " + ConsoleColors.BLUE_BRIGHT + "            |||             " + ConsoleColors.PURPLE_BRIGHT + "            |||              ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "                              " + ConsoleColors.CYAN_BRIGHT + "                            " + ConsoleColors.BLUE_BRIGHT + "                             ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "              ___             " + ConsoleColors.YELLOW_BRIGHT + "            ___             " + ConsoleColors.CYAN_BRIGHT + "            ___              ");
      System.out.println(ConsoleColors.RED_BRIGHT + "              |||             " + ConsoleColors.ORANGE_BRIGHT + "            |||             " + ConsoleColors.YELLOW_BRIGHT + "            |||              " );
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "              '''             " + ConsoleColors.RED_BRIGHT + "            '''             " + ConsoleColors.ORANGE_BRIGHT + "            '''              " + ConsoleColors.RESET);
      frameFlush(2);

      System.out.println(ConsoleColors.BLUE_BRIGHT + "              ...             " + ConsoleColors.PURPLE_BRIGHT + "            ...             " + ConsoleColors.RED_BRIGHT + "            ...              ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "              |||             " + ConsoleColors.BLUE_BRIGHT + "            |||             " + ConsoleColors.PURPLE_BRIGHT + "            |||              ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "             |||||            " + ConsoleColors.CYAN_BRIGHT + "           |||||            " + ConsoleColors.BLUE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "             |||||            " + ConsoleColors.YELLOW_BRIGHT + "           |||||            " + ConsoleColors.CYAN_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.RED_BRIGHT + "             |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||            " + ConsoleColors.YELLOW_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "             |||||            " + ConsoleColors.RED_BRIGHT + "           |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "             |||||            " + ConsoleColors.PURPLE_BRIGHT + "           |||||            " + ConsoleColors.RED_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "             |||||            " + ConsoleColors.BLUE_BRIGHT + "           |||||            " + ConsoleColors.PURPLE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "             |||||            " + ConsoleColors.CYAN_BRIGHT + "           |||||            " + ConsoleColors.BLUE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "             |||||            " + ConsoleColors.YELLOW_BRIGHT + "           |||||            " + ConsoleColors.CYAN_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.RED_BRIGHT + "             |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||            " + ConsoleColors.YELLOW_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "             |||||            " + ConsoleColors.RED_BRIGHT + "           |||||            " + ConsoleColors.ORANGE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "             |||||            " + ConsoleColors.PURPLE_BRIGHT + "           |||||            " + ConsoleColors.RED_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.CYAN_BRIGHT + "             |||||            " + ConsoleColors.BLUE_BRIGHT + "           |||||            " + ConsoleColors.PURPLE_BRIGHT + "           |||||             ");
      System.out.println(ConsoleColors.YELLOW_BRIGHT + "             '|||'            " + ConsoleColors.CYAN_BRIGHT + "           '|||'            " + ConsoleColors.BLUE_BRIGHT + "           '|||'             ");
      System.out.println(ConsoleColors.ORANGE_BRIGHT + "                              " + ConsoleColors.YELLOW_BRIGHT + "                            " + ConsoleColors.CYAN_BRIGHT + "                             ");
      System.out.println(ConsoleColors.RED_BRIGHT + "              ___             " + ConsoleColors.ORANGE_BRIGHT + "            ___             " + ConsoleColors.YELLOW_BRIGHT + "            ___              ");
      System.out.println(ConsoleColors.PURPLE_BRIGHT + "              |||             " + ConsoleColors.RED_BRIGHT + "            |||             " + ConsoleColors.ORANGE_BRIGHT + "            |||              ");
      System.out.println(ConsoleColors.BLUE_BRIGHT + "              '''             " + ConsoleColors.PURPLE_BRIGHT + "            '''             " + ConsoleColors.RED_BRIGHT + "            '''              " + ConsoleColors.RESET);      
      frameFlush(2);
    }
      
  }
  
  // Create frame by frame animations for slot game intro.
  public static void slotAnimator(){
    
    int i;
  
    Main.clearConsole();
    System.out.println(ConsoleColors.RESET + "                                       ");
    System.out.println("              _______                  ");
    System.out.println("             ||_|_|_||                 ");
    System.out.println("        ____/_________\\____           ");
    System.out.println("       / _________________ \\    __    ");
    System.out.println("      | |     |     |     | |  /  \\   ");
    System.out.println("      | | X X | X X | X X | |  \\__/   ");
    System.out.println("      | |  X  |  X  |  X  | |   ||     ");
    System.out.println("      | | X X | X X | X X | |   ||     ");
    System.out.println("      | |_____|_____|_____| |___||     ");
    System.out.println("     / /\\_________________/\\ \\__\\/ ");
    System.out.println("    / /---------------------\\ \\      ");
    System.out.println("   /_/_______________________\\_\\     ");
    System.out.println("  | |=========================| |      ");
    System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
    System.out.println(" /  /                         \\  \\   ");
    System.out.println("/__/___________________________\\__\\  ");
    System.out.println("|__________________________________|   ");
    frameFlush(1);

    System.out.println(ConsoleColors.RESET + "                                       ");
    System.out.println("              _______                ");  
    System.out.println("             ||_|_|_||                 ");
    System.out.println("        ____/_________\\____           ");
    System.out.println("       / _________________ \\          ");
    System.out.println("      | |     |     |     | |          ");
    System.out.println("      | | X X | X X | X X | |   __     ");
    System.out.println("      | |  X  |  X  |  X  | |  /  \\   ");
    System.out.println("      | | X X | X X | X X | |  \\__/   ");
    System.out.println("      | |_____|_____|_____| |___||     ");
    System.out.println("     / /\\_________________/\\ \\__\\/ ");
    System.out.println("    / /---------------------\\ \\      ");
    System.out.println("   /_/_______________________\\_\\     ");
    System.out.println("  | |=========================| |      ");
    System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
    System.out.println(" /  /                         \\  \\   ");
    System.out.println("/__/___________________________\\__\\  ");
    System.out.println("|__________________________________|   ");
    frameFlush(1);

    System.out.println(ConsoleColors.RESET + "                                       ");
    System.out.println("              _______                ");
    System.out.println("             ||_|_|_||                 ");
    System.out.println("        ____/_________\\____           ");
    System.out.println("       / _________________ \\          ");
    System.out.println("      | | X X |     | X X | |          ");
    System.out.println("      | |  X  | X X |  X  | |   __     ");
    System.out.println("      | | X X |  X  | X X | |  /  \\   ");
    System.out.println("      | |     | X X |     | |  \\__/   ");
    System.out.println("      | |_____|_____|_____| |___||     ");
    System.out.println("     / /\\_________________/\\ \\__\\/ ");
    System.out.println("    / /---------------------\\ \\      ");
    System.out.println("   /_/_______________________\\_\\     ");
    System.out.println("  | |=========================| |      ");
    System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
    System.out.println(" /  /                         \\  \\   ");
    System.out.println("/__/___________________________\\__\\  ");
    System.out.println("|__________________________________|   ");
    frameFlush(1);
    

    for(i = 0; i <= 2; ++i){
      System.out.println(ConsoleColors.RESET + "                                       ");
      System.out.println("              _______                  ");
      System.out.println("             ||_|_|_||                 ");
      System.out.println("        ____/_________\\____           ");
      System.out.println("       / _________________ \\    __    ");
      System.out.println("      | | X X |  X  | X X | |  /  \\   ");
      System.out.println("      | |  X  | X X |  X  | |  \\__/   ");
      System.out.println("      | | X X |  X  | X X | |   ||     ");
      System.out.println("      | |  X  | X X |  X  | |   ||     ");
      System.out.println("      | |_X_X_|__X__|_X_X_| |___||     ");
      System.out.println("     / /\\_________________/\\ \\__\\/ ");
      System.out.println("    / /---------------------\\ \\      ");
      System.out.println("   /_/_______________________\\_\\     ");
      System.out.println("  | |=========================| |      ");
      System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
      System.out.println(" /  /                         \\  \\   ");
      System.out.println("/__/___________________________\\__\\  ");
      System.out.println("|__________________________________|   ");      
      frameFlush(1);

      System.out.println(ConsoleColors.RESET + "                                       ");
      System.out.println("              _______                  ");
      System.out.println("             ||_|_|_||                 ");
      System.out.println("        ____/_________\\____           ");
      System.out.println("       / _________________ \\    __    ");
      System.out.println("      | |  X  | X X |  X  | |  /  \\   ");
      System.out.println("      | | X X |  X  | X X | |  \\__/   ");
      System.out.println("      | |  X  | X X |  X  | |   ||     ");
      System.out.println("      | | X X |  X  | X X | |   ||     ");
      System.out.println("      | |__X__|_X_X_|__X__| |___||     ");
      System.out.println("     / /\\_________________/\\ \\__\\/ ");
      System.out.println("    / /---------------------\\ \\      ");
      System.out.println("   /_/_______________________\\_\\     ");
      System.out.println("  | |=========================| |      ");
      System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
      System.out.println(" /  /                         \\  \\   ");
      System.out.println("/__/___________________________\\__\\  ");
      System.out.println("|__________________________________|   ");
      frameFlush(1);
    }

    System.out.println(ConsoleColors.RESET + "                                       ");
    System.out.println("              _______                ");
    System.out.println("             ||_|_|_||                 ");
    System.out.println("        ____/_________\\____           ");
    System.out.println("       / _________________ \\    __    ");
    System.out.println("      | | X X |  X  | X X | |  /  \\   ");
    System.out.println("      | |  X  | X X |  X  | |  \\__/   ");
    System.out.println("      | | X X |  X  | X X | |   ||     ");
    System.out.println("      | |  X  | X X |  X  | |   ||     ");
    System.out.println("      | |_X_X_|__X__|_X_X_| |___||     ");
    System.out.println("     / /\\_________________/\\ \\__\\/ ");
    System.out.println("    / /---------------------\\ \\      ");
    System.out.println("   /_/_______________________\\_\\     ");
    System.out.println("  | |=========================| |      ");
    System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
    System.out.println(" /  /                         \\  \\   ");
    System.out.println("/__/___________________________\\__\\  ");
    System.out.println("|__________________________________|   ");
    frameFlush(1);
    
    System.out.println(ConsoleColors.RESET + "          . * .  *  . * .              ");
    System.out.println("      - * , " + ConsoleColors.RED_BRIGHT + "\\__|_|_|__/" + ConsoleColors.RESET + " , * -         ");
    System.out.println("        '~   " + ConsoleColors.RED_BOLD + "||_|_|_||" + ConsoleColors.RESET + "    ~'            ");
    System.out.println("        ____/_________\\____           ");
    System.out.println("       / _________________ \\    __    ");
    System.out.println("      | |     |     |     | |  /  \\   ");
    System.out.println("      | |" + ConsoleColors.BLUE_BRIGHT + "W   W" + ConsoleColors.RESET + "| " + ConsoleColors.BLUE_BRIGHT + "'I'" + ConsoleColors.RESET + " |" + ConsoleColors.BLUE_BRIGHT + "N   N" + ConsoleColors.RESET + "| |  \\__/ ");
    System.out.println("      | |" + ConsoleColors.BLUE_BRIGHT + "W'W'W" + ConsoleColors.RESET + "|  " + ConsoleColors.BLUE_BRIGHT + "I" + ConsoleColors.RESET + "  |" + ConsoleColors.BLUE_BRIGHT + "N.N N" + ConsoleColors.RESET + "| |   ||   ");
    System.out.println("      | | " + ConsoleColors.BLUE_BRIGHT + "W.W" + ConsoleColors.RESET + " | " + ConsoleColors.BLUE_BRIGHT + ".I." + ConsoleColors.RESET + " |" + ConsoleColors.BLUE_BRIGHT + "N. .N" + ConsoleColors.RESET + "| |   ||   ");
    System.out.println("      | |_____|_____|_____| |___||     ");
    System.out.println("     / /\\_________________/\\ \\__\\/ ");
    System.out.println("    / /---------------------\\ \\      ");
    System.out.println("   /_/_______________________\\_\\     ");
    System.out.println("  | |=========================| |      ");
    System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |     ");
    System.out.println(" /  /                         \\  \\   ");
    System.out.println("/__/___________________________\\__\\  ");
    System.out.println("|__________________________________|   ");
    frameFlush(1);

    for(i = 0; i <= 3; ++i){
      System.out.println(ConsoleColors.RESET + "          * . *  .  * . *            ");
      System.out.println("      * ' . " + ConsoleColors.BLACK_BRIGHT + "\\__|_|_|__/" + ConsoleColors.RESET + " . ' *       ");
      System.out.println("        ~.   " + ConsoleColors.RED_BOLD + "||_|_|_||" + ConsoleColors.RESET + "   .~          ");
      System.out.println("        ____/_________\\____         ");
      System.out.println("       / _________________ \\    __  ");
      System.out.println("      | |     |     |     | |  /  \\ ");
      System.out.println("      | |" + ConsoleColors.ORANGE_BOLD + "W   W" + ConsoleColors.RESET + "| " + ConsoleColors.ORANGE_BOLD + "'I'" + ConsoleColors.RESET + " |" + ConsoleColors.ORANGE_BOLD + "N   N" + ConsoleColors.RESET + "| |  \\__/ ");
      System.out.println("      | |" + ConsoleColors.ORANGE_BOLD + "W'W'W" + ConsoleColors.RESET + "|  " + ConsoleColors.ORANGE_BOLD + "I" + ConsoleColors.RESET + "  |" + ConsoleColors.ORANGE_BOLD + "N.N N" + ConsoleColors.RESET + "| |   ||   ");
      System.out.println("      | | " + ConsoleColors.ORANGE_BOLD + "W.W" + ConsoleColors.RESET + " | " + ConsoleColors.ORANGE_BOLD + ".I." + ConsoleColors.RESET + " |" + ConsoleColors.ORANGE_BOLD + "N. .N" + ConsoleColors.RESET + "| |   ||   ");
      System.out.println("      | |_____|_____|_____| |___||   ");
      System.out.println("     / /\\_________________/\\ \\__\\/   ");
      System.out.println("    / /---------------------\\ \\    ");
      System.out.println("   /_/_______________________\\_\\   ");
      System.out.println("  | |=========================| |    ");
      System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |    ");
      System.out.println(" /  / " + ConsoleColors.YELLOW_BRIGHT + "0  O  o  0  o O0  0O  o " + ConsoleColors.RESET + "\\  \\   ");
      System.out.println("/__/__" + ConsoleColors.YELLOW_BRIGHT + "O0" + ConsoleColors.RESET + "___" + ConsoleColors.YELLOW_BRIGHT + "0" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "O" + ConsoleColors.RESET + "__" + ConsoleColors.YELLOW_BRIGHT + "0" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "__" + ConsoleColors.YELLOW_BRIGHT + "O" + ConsoleColors.RESET + "____" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "__\\__\\   ");
      System.out.println("|__________________________________|   ");
      frameFlush(1);
      
      System.out.println(ConsoleColors.RESET + "           . * .  *  . * .           ");
      System.out.println("      ' * , " + ConsoleColors.RED_BRIGHT + "\\__|_|_|__/" + ConsoleColors.RESET + " , * '       ");
      System.out.println("        '~   " + ConsoleColors.RED_BOLD + "||_|_|_||" + ConsoleColors.RESET + "   ~'          ");
      System.out.println("        ____/_________\\____         ");
      System.out.println("       / _________________ \\    __  ");
      System.out.println("      | |     |     |     | |  /  \\ ");
      System.out.println("      | |" + ConsoleColors.BLUE_BRIGHT + "W   W" + ConsoleColors.RESET + "| " + ConsoleColors.BLUE_BRIGHT + "'I'" + ConsoleColors.RESET + " |" + ConsoleColors.BLUE_BRIGHT + "N   N" + ConsoleColors.RESET + "| |  \\__/ ");
      System.out.println("      | |" + ConsoleColors.BLUE_BRIGHT + "W'W'W" + ConsoleColors.RESET + "|  " + ConsoleColors.BLUE_BRIGHT + "I" + ConsoleColors.RESET + "  |" + ConsoleColors.BLUE_BRIGHT + "N.N N" + ConsoleColors.RESET + "| |   ||   ");
      System.out.println("      | | " + ConsoleColors.BLUE_BRIGHT + "W.W" + ConsoleColors.RESET + " | " + ConsoleColors.BLUE_BRIGHT + ".I." + ConsoleColors.RESET + " |" + ConsoleColors.BLUE_BRIGHT + "N. .N" + ConsoleColors.RESET + "| |   ||   ");
      System.out.println("      | |_____|_____|_____| |___||   ");
      System.out.println("     / /\\_________________/\\ \\__\\/   ");
      System.out.println("    / /---------------------\\ \\    ");
      System.out.println("   /_/_______________________\\_\\   ");
      System.out.println("  | |=========================| |    ");
      System.out.println("  | |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\| |    ");
      System.out.println(" /  /" + ConsoleColors.YELLOW_BRIGHT + "O  o  0  o  0 oO  Oo  0  " + ConsoleColors.RESET + "\\  \\   ");
      System.out.println("/__/___" + ConsoleColors.YELLOW_BRIGHT + "0o" + ConsoleColors.RESET + "___" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "0" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "__" + ConsoleColors.YELLOW_BRIGHT + "O" + ConsoleColors.RESET + "_" + ConsoleColors.YELLOW_BRIGHT + "0" + ConsoleColors.RESET + "__" + ConsoleColors.YELLOW_BRIGHT + "o" + ConsoleColors.RESET + "____" + ConsoleColors.YELLOW_BRIGHT + "0" + ConsoleColors.RESET + "_\\__\\   ");
      System.out.println("|__________________________________|   ");
      frameFlush(1);
    }

  }

  // Flush the frame to for a clean canvas every 'X' microseconds.
  public static void frameFlush(int modifier){

    if(modifier == 0){
      modifier = 1;
    }
    
    try{
      TimeUnit.MICROSECONDS.sleep(100000 * modifier);
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
    Main.clearConsole();    
  }
  
}

