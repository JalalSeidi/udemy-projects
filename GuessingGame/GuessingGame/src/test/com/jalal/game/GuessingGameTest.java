package com.jalal.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

  private GuessingGame game;

  @BeforeEach
  void setUp() {
    game = new GuessingGame();
  }

  @Test
  public void testSimpleWinSituation() {
    int randomNum = game.getRandomNum();
    String message = game.guess(randomNum);
    assertEquals("You got it", message);
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
    for (int counter = 0; counter < 100; counter++) {
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
}
