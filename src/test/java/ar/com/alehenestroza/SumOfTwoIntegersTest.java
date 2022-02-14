package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    @Test
    void test_getSum_case1() {
        assertEquals(3, SumOfTwoIntegers.getSum(1, 2));
    }

    @Test
    void test_getSum_case2() {
        assertEquals(5, SumOfTwoIntegers.getSum(2, 3));
    }

    @Test
    void test_getSum_case3() {
        assertEquals(5, SumOfTwoIntegers.getSum(-3, 8));
    }

}