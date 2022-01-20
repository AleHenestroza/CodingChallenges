package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void test_maximumSubarray_case1() {
        assertEquals(6, MaximumSubarray.maximumSubarray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void test_maximumSubarray_case2() {
        assertEquals(1, MaximumSubarray.maximumSubarray(new int[] {1}));
    }

    @Test
    void test_maximumSubarray_case3() {
        assertEquals(23, MaximumSubarray.maximumSubarray(new int[] {5, 4, -1, 7, 8}));
    }
}