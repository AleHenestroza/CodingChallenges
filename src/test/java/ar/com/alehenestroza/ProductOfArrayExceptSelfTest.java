package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void test_productExceptSelf_case1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = new int[]{24, 12, 8, 6};
        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(input));
    }

    @Test
    void test_productExceptSelf_case2() {
        int[] input = new int[]{-1, 1, 0, -3, 3};
        int[] output = new int[]{0, 0, 9, 0, 0};
        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(input));
    }
}