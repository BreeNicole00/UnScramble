import java.util.Scanner;

class Game {

  static Scanner theScanner = new Scanner(System.in);
  static int playersPoints = 0;
  
  public static void main(String[] args) {
    System.out.println("Welcome 👋!!!!\nCAN YOU UNSCRAMBLE ME?");
    while (!isChallengeComplete()) {
      String difficultyLevel = getDifficultyLevel();
      operateLevel1(difficultyLevel);
      operateLevel2(difficultyLevel);
      operateLevel3(difficultyLevel);
      operateLevel4(difficultyLevel);
    }
     System.out.println("Congrats!You've Passed.");
    }
    
  static String getDifficultyLevel() {
    System.out.println("What level of difficulty would you like to play?");
    System.out.print("Options: easy, mild, hard\n");
    return  theScanner.nextLine();
  }
  
   /**
   * Get presented with scrambled word and keep inputing answer until correct
   * 
   * @param Get the scrambled word and correct word
   * @return what you think the scrambled word is
   */
  static void findRightWord(String correctWord, String jumbledWord) {
     boolean solved = false;
     do {
     System.out.printf("Unscramble: '%s'\n", jumbledWord);
        String playersChoice = theScanner.nextLine();
        if (playersChoice.equals(correctWord)) {
          System.out.println("You are correct!");
          solved = true;
        } else { 
          System.out.println("Incorrect");
        }
     } while (!solved);
  }
  
   /**
   * Attempt first level of difficulty type
   * 
   * @param play for the first time
   * @return the correct word
   */
  static void operateLevel1(String play) {
    switch (play) {
      case "easy":
        findRightWord("cheater", "reteach");
        playersPoints += 2;
        break;
      case "mild":
        findRightWord("relationship", "onireahtislp");
        playersPoints += 4;
        break;
      default:
        findRightWord("indefinitely", "neiifndtiyle");
        playersPoints += 6;
    }
  }
  
   /**
   * Attempt second level of difficulty type
   * 
   * @param play for the secod time
   * @return the correct word
   */
  static void operateLevel2(String play2) {
    switch (play2) {
      case "easy":
        findRightWord("scarce", "carsec");
        playersPoints += 2;
        break;
     case "mild":
        findRightWord("receive", "revceei");
        playersPoints += 4;
        break;
      default:
        findRightWord("impulse", "mpsieul");
        playersPoints += 6;
    }
  }
  
   /**
   * Attempt third level of difficulty type
   * 
   * @param play for the third time
   * @return the correct word
   */
  static void operateLevel3(String play3) {
    switch (play3) {
      case "easy":
        findRightWord("minor", "mirno");
        playersPoints += 2;
        break;
      case "mild":
        findRightWord("donate", "tnadeo");
        playersPoints += 4;
        break;
      default:
        findRightWord("sentence","encsneet" );
        playersPoints += 6;
        break;
    }
  }
  
   /**
   * Attempt fourth level of difficulty type
   * 
   * @param play for the fourth time
   * @return the correct word and your score
   */
  static void operateLevel4(String play4) {
    switch (play4) {
      case "easy":
        findRightWord("server", "srreev");
        playersPoints += 2;
        System.out.printf("Your score is %s\n", playersPoints);
        break;
      case "mild":
        findRightWord("promise", "rospemi");
        playersPoints += 4;
        System.out.printf("Your score is %s\n", playersPoints);
        break;
      default:
        findRightWord("reaction","ireacnot" );
        playersPoints += 6;
        System.out.printf("Your score is %s\n", playersPoints);
        break;
    }
  }
  
  static boolean isChallengeComplete() {
    return playersPoints >= 25;
  }
}
