import org.example.bai3.Division;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBai3 {
    @Test
    void testDivision() {

        assertEquals(2.0, Division.division(4.0, 2.0));

        assertEquals(2.5, Division.division(5.0, 2.0));


    }
}
