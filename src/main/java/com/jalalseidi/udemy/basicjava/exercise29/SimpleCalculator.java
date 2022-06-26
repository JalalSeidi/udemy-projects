package com.jalalseidi.udemy.basicjava.exercise29;

public class SimpleCalculator {
  private double firstNumber;
  private double secondNumber;

  public double getFirstNumber() {
    return this.firstNumber;
  }

  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public double getSecondNumber() {
    return this.secondNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAdditionResul() {
    return this.firstNumber + this.secondNumber;
  }

  public double getSubtractionResult() {
    return this.firstNumber - this.secondNumber;
  }

  public double getMultiplicationResult() {
    return this.firstNumber * this.secondNumber;
  }

  public double getDivisionResult() {
    if (secondNumber != 0) {
      return this.firstNumber / this.secondNumber;
    } else {
      return 0;
    }
  }
}
