import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorJunit5Test {

    private Calculator calculator;

    @BeforeAll
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(377, calculator.add(365, 12));
        assertEquals(377, calculator.add(12, 365));
    }

    @Test
    public void subtract() {
        assertEquals(353, calculator.subtract(365, 12));
        assertEquals(-353, calculator.subtract(12, 365));
    }

    @Test
    public void multiply() {
        assertEquals(4380, calculator.multiply(365, 12));
        assertEquals(4380, calculator.multiply(12, 365));
    }

    @Test
    public void divide() {
        assertEquals(36.5, calculator.divide(365, 10));
    }

    @Test
    public void divideByZeroPassed() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(365, 0);
        });

        assertTrue(exception.getMessage().contains("zero"));
    }

    @Test
    public void divideByZeroFailed() {
        assertThrows(IllegalStateException.class, () -> {
            calculator.divide(365, 0);
        });
    }

    @Test
    public void divideByZeroError() {
        calculator.divide(365, 0);
    }

    @Disabled
    @Test
    public void divideByZeroIncomplete() {
        calculator.divide(365, 0);
    }
}
