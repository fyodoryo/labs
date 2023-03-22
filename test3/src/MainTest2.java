import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void mainusn() {
        int dohod = 100;
        double usnd = Main.mainusn(dohod);
        assertEquals(7, usnd, 0 );
    }
}


