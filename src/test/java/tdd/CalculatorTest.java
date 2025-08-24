package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void additionTwoNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }


    @Test
    void subtractionTwoNumbers() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    void multiplicationTwoNumbers(){
        Calculator calc = new Calculator();
        int result = calc.multiply(10,10);
        assertEquals(100, result);
    }

    @Test
    void divisionTwoNumbers(){
        Calculator calc = new Calculator ();
        int result = calc.divide(25, 5);
        assertEquals(5, result);
    }

    @Test
    void addEmptyStringReturnsZero() {
        Calculator calc = new Calculator();
        int result = calc.add("");
        assertEquals(0, result);
    }

    @Test
    void addSingleNumberStringReturnsValue() {
        Calculator calc = new Calculator();
        int result = calc.add("5");
        assertEquals(5, result);
    }


}