package com.jalal.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
  @Test
  void canGetValueOfATwoCard() {
    Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
    assertEquals(2, card1.getValue());
  }

  @Test
  void canGetValueOfAThreeCard() {
    Card card1 = new Card(Suit.DIAMONDS, Rank.THREE);
    assertEquals(3, card1.getValue());
  }

  @Test
  void canGetValueOfAnAceCard() {
    Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
    assertEquals(1, card1.getValue());
  }
}