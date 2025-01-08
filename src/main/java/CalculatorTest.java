import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0), "MAX_VALUE + 0 should equal MAX_VALUE");
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE, 0), "MIN_VALUE + 0 should equal MIN_VALUE");
        assertEquals(-1, calculator.add(-1, 0), "-1 + 0 should equal -1");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(0, calculator.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE), "MAX_VALUE - MAX_VALUE should equal 0");
        assertEquals(0, calculator.subtract(Integer.MIN_VALUE, Integer.MIN_VALUE), "MIN_VALUE - MIN_VALUE should equal 0");
        assertEquals(-1, calculator.subtract(-1, 0), "-1 - 0 should equal -1");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(Integer.MAX_VALUE, 0), "MAX_VALUE * 0 should equal 0");
        assertEquals(0, calculator.multiply(Integer.MIN_VALUE, 0), "MIN_VALUE * 0 should equal 0");
        assertEquals(1, calculator.multiply(-1, -1), "-1 * -1 should equal 1");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(1, calculator.divide(Integer.MAX_VALUE, Integer.MAX_VALUE), "MAX_VALUE / MAX_VALUE should equal 1");
        assertEquals(1, calculator.divide(Integer.MIN_VALUE, Integer.MIN_VALUE), "MIN_VALUE / MIN_VALUE should equal 1");
        assertEquals(1, calculator.divide(-1, -1), "-1 / -1 should equal 1");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0), "Dividing by zero should throw IllegalArgumentException");
    }
}