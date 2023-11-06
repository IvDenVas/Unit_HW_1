package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(90, calculator.calculateDiscount(100,10));
    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(5, calculator.calculateDiscount(100, 10));
    }
    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.calculateDiscount(100, 10) == 90);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.calculateDiscount(100, 10) == 50);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrowsFirst() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(0, 10));
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrowsSecond() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100, -10));
    }

}