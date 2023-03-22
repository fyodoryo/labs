import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sum() {
        int [] prices = {100};
        int productNumber = 0;
        int currentPrice = 0;
        int productCount = 1;
        int sumProducts = 200;
        int result = Main.sum(prices, productNumber, currentPrice, sumProducts  );
        assertEquals(200, result);
    }


}
