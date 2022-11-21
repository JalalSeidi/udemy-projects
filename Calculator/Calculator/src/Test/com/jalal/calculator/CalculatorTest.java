package com.jalal.calculator;
import com.jalal.clalculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

      @Test()
      @Disabled
      public void canAddMaxIntToOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        System.out.println(sum);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
      }

      @Test
      public void canSubtract() {
        int sub = calc.sub(1,2);
        System.out.println(sub);
        assertEquals(-1, sub);
      }

      @Test
      public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, ".06", 1);
        assertEquals("$184,664.43", answer);
      }

      @Test
      public void annuityExample2() {
        String answer = calc.calcAnnuity("1200", 10, ".08", 4);
        assertEquals("$72,482.38", answer);
      }

  }
