package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void test_containsDuplicate_case1() {
        int[] nums = {1,2,3,1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    void test_containsDuplicate_case2() {
        int[] nums = {1, 2, 3, 4};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }

    @Test
    void test_containsDuplicate_case3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

}