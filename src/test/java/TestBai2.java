import org.example.bai2.Multiplication;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBai2 {
    @Test
    public void testMultiplication() {
        // Kiểm tra với các giá trị dương
        assertEquals(10.0, Multiplication.multiplication(2.0, 5.0));

        // Kiểm tra với các giá trị âm
        assertEquals(-6.0, Multiplication.multiplication(-3.0, 2.0));

        // Kiểm tra với a = 0
        assertEquals(0.0, Multiplication.multiplication(0.0, 7.0));

        // Kiểm tra với b = 0
        assertEquals(0.0, Multiplication.multiplication(4.0, 0.0));

        // Kiểm tra với cả a và b đều bằng 0
        assertEquals(0.0, Multiplication.multiplication(0.0, 0.0));
    }
}
