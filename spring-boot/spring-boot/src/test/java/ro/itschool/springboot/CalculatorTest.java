package ro.itschool.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        //given
        int a = 5;
        int b = 3;
        int expectedResult = a + b;
        //when
        int actualResult = calculator.add(a, b);
        //then
        assertEquals(expectedResult, actualResult, "The additional result should be eqaul to the expected result.");
    }

    @Test
    public void testSubtract() {
        //given
        int a = 5;
        int b = 3;
        int expactedResult = a - b;
        //when
        int actualResult = calculator.substract(a, b);
        //then
        assertEquals(expactedResult, actualResult, "The substraction result should be equal to the expected result.");
    }

    @Test
    public void testMultiply() {
        //given
        int a = 5;
        int b = 3;
        int expactedResult = a * b;
        //when
        int actualResult = calculator.multiply(a, b);
        //then
        assertEquals(expactedResult, actualResult, "The substraction result should be equal to the expected result.");
    }

    @Test
    public void testDivide() {
        //given
        int a = 5;
        int b = 3;
        int expactedResult = a / b;
        //when
        int actualResult = calculator.divide(a, b);
        //then
        assertEquals(expactedResult, actualResult, "The substraction result should be equal to the expected result.");
    }
}

