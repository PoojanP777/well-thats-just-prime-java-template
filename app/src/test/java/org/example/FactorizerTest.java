package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(1));
  }

  @Test
  void itReturnsPrimeFactorsForNine() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(3);
    expected.add(3);
    assertEquals(expected, factorizer.primeFactors(9));
  }

  @Test
  void itReturnsPrimeFactorsForTen() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(5);
    assertEquals(expected, factorizer.primeFactors(10));
  }
}
