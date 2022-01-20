package ar.com.alehenestroza;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Constraints:

1.    1 <= nums.length <= 105
2.    -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
        // Time complexity: O(n)
        // Space complexity: O(n)
    }

}
