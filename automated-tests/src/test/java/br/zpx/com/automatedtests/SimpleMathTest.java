package br.zpx.com.automatedtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void sum() {
        SimpleMath simpleMath = new SimpleMath();
        Double actual = simpleMath.sum(2D, 2D);
        Double expected = 4D;
        assertEquals(expected,actual,"O resultado esperado da soma não foi o encotrado");
        assertNotEquals(5D,actual);
        assertNotNull(actual);
    }

    @Test
    void subtraction() {
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