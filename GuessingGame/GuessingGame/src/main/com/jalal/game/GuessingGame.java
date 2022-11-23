package com.jalal.game;

public class GuessingGame {
  public String guess(int guessedNumber) {
    return guessedNumber == getRandomNum() ? "You got it" : "You didn't get it";
  }

  public int getRandomNum() {
    return 0;
  }
}
