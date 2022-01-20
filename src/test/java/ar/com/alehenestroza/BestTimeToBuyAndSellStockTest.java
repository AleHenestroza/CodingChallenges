package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void test_bestTimeToBuyAndSell_case1() {
        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSell(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void test_bestTimeToBuyAndSell_case2() {
        assertEquals(0, BestTimeToBuyAndSellStock.bestTimeToBuyAndSell(new int[]{7, 6, 4, 3, 1}));
    }

}