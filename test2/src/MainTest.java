import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

        @Test
        void task2True() {
            String input = "2025";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            String a = Main.task2();
            String str = "Результат 365 дней";
            assertEquals(str, a);
        }
        @Test
        void task2False() {
            String input = "2028";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            String a = Main.task2();
            String str = "Результат 365 дней";
            assertEquals(str, a);
        }
    }

