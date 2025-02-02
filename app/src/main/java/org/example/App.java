package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println(factorizer.primeFactors(0)); // []
    System.out.println(factorizer.primeFactors(1)); // []
    System.out.println(factorizer.primeFactors(9)); // [3, 3]
    System.out.println(factorizer.primeFactors(10)); // [2, 5]
  }
}