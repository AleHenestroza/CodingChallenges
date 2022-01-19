package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void test_twoSum_case1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void test_twoSum_case2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void test_twoSum_case3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}