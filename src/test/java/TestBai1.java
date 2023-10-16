import org.example.bai1.Calculator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBai1 {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        assertEquals(4.0, calculator.add(2.0, 2.0));
        assertEquals(-2.0, calculator.add(-3.0, 1.0));
        assertEquals(5.0, calculator.add(0.0, 5.0));
        assertEquals(3.0, calculator.add(3.0, 0.0));
        assertEquals(0.0, calculator.add(0.0, 0.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(3.0, calculator.subtract(5.0, 2.0));
        assertEquals(-4.0, calculator.subtract(-2.0, 2.0));
        assertEquals(-7.0, calculator.subtract(0.0, 7.0));
        assertEquals(4.0, calculator.subtract(4.0, 0.0));
        assertEquals(0.0, calculator.subtract(0.0, 0.0));
    }
}
