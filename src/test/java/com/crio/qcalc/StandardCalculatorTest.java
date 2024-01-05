package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Doubles")
    void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply(3.1, 2.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(7.75, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Doubles")
    void testDivisionOperationForDoubles(){
        standardCalculator.divide(7.5, 2);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(3.75, actualResult);
    }

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(3, 6);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(18, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(18, 6);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    @DisplayName("Test Addition Double Overflow")
    void testAdditionOverflow(){
        Assertions.assertThrows(ArithmeticException.class, ()->{
            standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Subtraction Double Overflow")
    void testSubtractionOverflow(){
        Assertions.assertThrows(ArithmeticException.class, ()->{
            standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Multiplication Double Overflow")
    void testMultiplicationOverflow(){
        Assertions.assertThrows(ArithmeticException.class, ()->{
            standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    @DisplayName("Test Division Double Overflow")
    void testDivisionOverflow(){
        Assertions.assertThrows(ArithmeticException.class, ()->{
            standardCalculator.divide(Double.MAX_VALUE, 0);
        });
    }
}
