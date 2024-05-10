package br.zpx.com.automatedtests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste de Operações da Classe Simple Math")
class SimpleMathTest {

    //test[System Under Test]_[Condition or State Change]_[Expected result]
    @BeforeAll
    static void setUp() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("Running @AfterAll method!");
    }

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");

    }

    @Test
    @DisplayName("Test 2 + 2 = 4")
    void sum() {

        // given
        Double firstNumber = 2D;
        Double secondNumber = 2D;
        Double expected = 4D;

        //when
        Double actual = math.sum(firstNumber, secondNumber);

        //then
        assertEquals(expected, actual,
                () -> String.format("A soma entre %.2f + %.2f , não retornou o valor %.2f", firstNumber, secondNumber, expected)); // lazy assert messages
        assertNotEquals(5D, actual);
        assertNotNull(actual);

    }

    @Test
    @DisplayName("Teste 10 - 2 = 8")
    void subtraction() {

        //given
        Double firstNumber = 10D;
        Double secondNumber = 2D;
        Double expected = 8D;

        //when
        Double actual = math.subtraction(firstNumber, secondNumber);

        //then
        assertNotNull(firstNumber);
        assertNotNull(secondNumber);
        assertEquals(expected, actual, () -> String.format("A Subtração entre %.2f - %.2f não resultou o resultado esperado", firstNumber, secondNumber));
        assertNotEquals(4, expected);

    }

    @Test
    @DisplayName("Test 10 * 2 = 20")
    void multiplication() {

        //Given
        Double firstNumber = 10D;
        Double secondNumber = 2D;
        Double expected = 20D;

        // when
        Double actual = math.multiplication(firstNumber, secondNumber);

        //then
        assertEquals(expected, actual, () -> String.format("A multiplicação de %.2f * %.2f não resultou no valor %.2f", firstNumber, secondNumber, expected));
        assertNotNull(firstNumber);
        assertNotNull(secondNumber);
        assertNotEquals(10, actual);


    }

    @Test
    @DisplayName("Test 10 / 2 = 5")
    void division() {

        //given
        Double firstNumber = 10D;
        Double secondNumber = 2D;
        Double expected = 5D;

        //when
        Double actual = math.division(firstNumber, secondNumber);

        //then
        assertNotNull(firstNumber);
        assertEquals(expected, actual, () -> String.format("A divisão entre %.1f / %.1f não resultou no valor esperado",firstNumber,secondNumber));
        assertNotEquals(6D,actual);
    }

    @Test
    @Disabled("TODO: Nos precisamos trabalhar com a raiz quadrada")
    void squareRoot() {
    }
}