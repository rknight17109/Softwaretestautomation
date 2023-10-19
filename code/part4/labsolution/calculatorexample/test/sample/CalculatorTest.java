package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
  private Calculator calculator;

  @BeforeEach
  void init() {
    calculator = new Calculator();
  }

  @Test
  void addTwoPositiveNumbers(){
    assertEquals(5, calculator.add(4, 1));
  }

  @Test
  void addTwoNegativeNumbers(){
    assertEquals(-5, calculator.add(-2, -3));
  }

  //more tests for overflow, etc. and different combination of signs, etc.

  @Test
  void divideTwoPostiveNumbers(){
    assertEquals(6, calculator.divide(12, 2));
  }

  //comment out the following test as you try this example
  @Test
  void divideByZero(){
    assertThrows(ArithmeticException.class, () -> calculator.divide(12, 0));
  }

  //imagine that we do not have the above test. You may comment out the test and try the following:
  //now we decide to make one small change to the code.

  //we realized that it is better to use double instead of int for the operations.
  //So we make the change, recompile the code, and no errors are seen.

  //it compiles, .... ship it

  //Now, if we run the tests we will not get any indication of a hidden ticking time bomb

  //Now suppose, we wrote the division by zero test.
  //In this case the effect of out code change is caught right away.
}
