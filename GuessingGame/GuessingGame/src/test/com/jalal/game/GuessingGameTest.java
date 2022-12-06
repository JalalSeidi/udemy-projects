package com.jalal.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

  public static final int Game_Randomness_Retries = 100;
  private GuessingGame game;

  @BeforeEach
  void setUp() {
    game = new GuessingGame();
  }

  @Test
  public void testSimpleWinSituation() {
    int randomNum = game.getRandomNum();
    String message = game.guess(randomNum);
    assertEquals("You got it in 1 try", message);
  }

  @Test
  public void testOneWrongNegGuessSituation() {
    String message = game.guess(-5);
    assertEquals("You didn't get it", message);
  }

  @Test
  public void testOneWrongPosGuessSituation() {
    int randomNum = game.getRandomNum();
    String message = game.guess(randomNum + 1);
    assertEquals("You didn't get it", message);
  }

  @Test
  public void testRandomNumberGeneration() {

    int[] rndNumCount = new int[11];
    for (int counter = 0; counter < Game_Randomness_Retries; counter++) {
      GuessingGame game = new GuessingGame();
      int randomNum = game.getRandomNum();
      rndNumCount[randomNum] = 1;
    }

    int sum = 0;
    for (int counter = 0; counter < 11; counter++) {
      sum += rndNumCount[counter];
    }

    assertEquals(10, sum);
  }

  @Test
  public void testFourWrongGuesses() {
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    String message = game.guess(-3);
    assertEquals("You didn't get it and you've had 4 tries. Game over.", message);
  }

  @Test
  public void testTenWrongGuesses() {
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    String message = game.guess(-3);
    assertEquals("Sorry, you are limited to 4 tries. Your game is over.", message);
  }

  @Test
  public void testThreeWrongGuessesAndOneCorrect() {
    game.guess(-3);
    game.guess(-3);
    game.guess(-3);
    int correctAnswer = game.getRandomNum();
    String message = game.guess(correctAnswer);
    assertEquals("You got it in 4 tries", message);
  }

  @Test
  public void testTwoWrongGuessesAndOneCorrect() {
    game.guess(-3);
    game.guess(-3);
    int correctAnswer = game.getRandomNum();
    String message = game.guess(correctAnswer);
    assertEquals("You got it in 3 tries", message);
  }
}
