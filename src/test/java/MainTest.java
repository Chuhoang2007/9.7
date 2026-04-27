
// 1. Static import phai nam tren cung
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// 2. Sau do moi den import thong thuong
import org.example.Main;
import org.junit.jupiter.api.Test;

/**
 * Lop kiem thu cho Main de kiem tra cac phep tinh.
 */
class MainTest {

    /**
     * Kiem tra tinh nang tinh tong cua lop Main.
     */
    @Test
    void testTinhTong() {
        // Dung 4 dau cach de thut dau dong (Indentation)
        assertEquals(10, Main.tinhTong(5, 5), "5 + 5 phai bang 10");
    }
}