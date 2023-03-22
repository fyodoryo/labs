import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    @Test
    void mainrd() {
        double ok = 36.78;
        double res = Main2.mainrd(ok);
        assertEquals(37, res, 0);
    }
}


