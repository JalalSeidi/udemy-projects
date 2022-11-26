package com.jalal.game;

import java.util.Random;

public class GuessingGame {
  private final int randomNumber = new Random().nextInt(10) + 1;
  public String guess(int guessedNumber) {
    return guessedNumber == getRandomNum() ? "You got it" : "You didn't get it";
  }

  public int getRandomNum() {
    return randomNumber;
  }
}
