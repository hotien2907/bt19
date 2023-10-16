import org.example.bai4bai5.FindMax;
import org.example.bai4bai5.FindMin;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testbai4bai5 {

    @Test
    public void kiemTraTimMin() {
        int[] soNguyen = {5, 3, 8, 1, 9};
        int ketQua = FindMin.FindMin(soNguyen);
        assertEquals(1, ketQua);
    }


    @Test
    public void kiemTraTimMax() {
        int[] soNguyen = {5, 3, 8, 1, 9};
        int ketQua = FindMax.findMax(soNguyen);
        assertEquals(9, ketQua);
    }

}
