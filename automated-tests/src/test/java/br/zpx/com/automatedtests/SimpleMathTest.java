package br.zpx.com.automatedtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void sum() {

        SimpleMath simpleMath = new SimpleMath();
        Double firstNumber = 2D;
        Double secondNumber = 2D;

        Double actual = simpleMath.sum(firstNumber, secondNumber);
        Double expected = 4D;

        assertEquals(expected,actual,
                () -> firstNumber +" + "+secondNumber+" Não retornou o resultado esperado!"); // lazy assert messages
        assertNotEquals(5D,actual);
        assertNotNull(actual);

    }

    @Test
    void subtraction() {

        SimpleMath simpleMath = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 2D;

        Double actual = simpleMath.subtraction(firstNumber,secondNumber);
        Double expected = 8D;

        assertNotNull(firstNumber);
        assertNotNull(secondNumber);

        assertEquals(expected,actual, () -> String.format("A Subtração entre %.2f - %.2f não resultou o resultado esperado",firstNumber,secondNumber));
        assertNotEquals(4,expected);

    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }

    @Test
    void mean() {
    }

    @Test
    void squareRoot() {
    }
}