package sample;

public class Calculator {
  public int add(int op1, int op2) {
    return op1 + op2;
  }

  public int divide(int numerator, int denominator) {
    return numerator / denominator;
  }

//  public double add(double op1, double op2) {
//    return op1 + op2;
//  }

//  public double divide(double numerator, double denominator) {
//    return numerator / denominator;
//  }
//try the above first and then get to this later.
//  public double divide(double numerator, double denominator) {
//    if(denominator == 0) {
//      throw new ArithmeticException("Division by zero");
//    }
//
//    return numerator / denominator;
//  }
}
