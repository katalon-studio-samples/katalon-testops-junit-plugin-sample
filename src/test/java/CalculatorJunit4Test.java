import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CalculatorJunit4Test {

    private Calculator calculator;

    @Before
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
        assertEquals(36.5, calculator.divide(365, 10), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroPassed() {
        calculator.divide(365, 0);
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

    @Ignore
    @Test
    public void divideByZeroIncomplete() {
        calculator.divide(365, 0);
    }
}
