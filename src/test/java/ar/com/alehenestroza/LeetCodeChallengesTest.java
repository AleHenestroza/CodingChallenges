package ar.com.alehenestroza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeChallengesTest {

    @Test
    void test_twoSum_case1() {
        LeetCodeChallenges lcc = new LeetCodeChallenges();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = lcc.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void test_twoSum_case2() {
        LeetCodeChallenges lcc = new LeetCodeChallenges();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = lcc.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void test_twoSum_case3() {
        LeetCodeChallenges lcc = new LeetCodeChallenges();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = lcc.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}