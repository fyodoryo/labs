import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
     void summa() {
        int i1 = 50;
        int i2 = 60;
        int i3 = 8;
        int result = i1 + i2 + i3;
        assertEquals(result,Main.summ(i1, i2, i3));
    }

    @org.junit.jupiter.api.Test
    void summ() {
    }
}