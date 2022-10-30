import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class Guessing {

  public static final int MAX_ALLOWED_TRIED = 4;

  public static void main(String[] args) {
    int randomNum = new Random().nextInt(10) + 1;
    System.out.printf("number is %d%n", randomNum);
    String guessedNum = null;
    int wrongGuessedNum = 1;
    for (; wrongGuessedNum <= MAX_ALLOWED_TRIED; wrongGuessedNum++) {
      guessedNum = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
      if (guessedNum.matches("-?\\d{1,2}")) {
        int guessedNumInt = Integer.parseInt(guessedNum);
        if (randomNum == guessedNumInt) {
          String tryText = wrongGuessedNum == 1 ? "try" : "tries";
          System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuessedNum, tryText);
          break;
        } else {
          if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            System.out.printf("You did not get it!%n");
            continue;
          }
          System.out.println("You suck");
        }
      }
    }
    if (wrongGuessedNum >= MAX_ALLOWED_TRIED) {
      System.out.printf("You've had %d incorrect guesses. The random number was %d. Ending program now.%n", wrongGuessedNum, randomNum);
    }
    System.out.println("Program ended...");
  }
}
