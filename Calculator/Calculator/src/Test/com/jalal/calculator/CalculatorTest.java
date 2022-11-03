package com.jalal.calculator;
import com.jalal.clalculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CalculatorTest {

      private Calculator calc;

      @BeforeEach
      void setUp() {
        calc = new Calculator();
      }

      @Test
    public void canAddZeroToZero() {
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Was expecting the Sum of 0");
    }

      @Test
      public void canAddOneToOne() {
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
      }

  }
