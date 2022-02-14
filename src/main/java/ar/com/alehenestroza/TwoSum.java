package ar.com.alehenestroza;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Constraints:
1.    2 <= nums.length <= 104
2.    -109 <= nums[i] <= 109
3.    -109 <= target <= 109
4.    Only one valid answer exists.

 */
public class TwoSum {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
