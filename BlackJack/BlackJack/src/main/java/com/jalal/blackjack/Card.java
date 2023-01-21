package com.jalal.blackjack;

public class Card {
  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Card(String suit, String Rank) {
    this.suit = Suit.valueOf(suit.toUpperCase());
    this.rank = com.jalal.blackjack.Rank.valueOf(Rank.toUpperCase());
  }

  public Suit getSuit() {
    return suit;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }

  public static void main(String[] args) {
    Card card1 = new Card(Suit.CLUBS, Rank.JACK);
    Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
    Card card3 = new Card("hearts", "queen");

    System.out.println(card1);
    System.out.println(card2);
    System.out.println(card3);
  }

  @Override
  public String toString() {
    return this.rank.toString().concat(" ").concat(this.suit.toString());
  }

  public int getValue() {
    return this.rank.getValue();
  }

}
