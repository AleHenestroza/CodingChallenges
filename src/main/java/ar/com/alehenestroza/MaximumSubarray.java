package ar.com.alehenestroza;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104

 */
public class MaximumSubarray {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int maximumSubarray(int[] array) {
        int maxSum = array[0];
        int sum = 0;

        for (int i = 0; i <  array.length; i++) {
            // If the sum is negative, then it doesn't add to the total, so we can discard it
            if (sum < 0) {
                sum = 0;
            }
            // Add the current number to the sum
            sum += array[i];
            // maxSum will store the maximum sum of the array so far, so we can compare it to the current sum each time
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
