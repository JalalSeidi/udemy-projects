package com.jalal.blackjack;

public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;

  public int getValue() {
    return switch (this) {
      case JACK, QUEEN, KING -> 10;
      default -> ordinal() + 1;
    };
  }
}
