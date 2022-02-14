package ar.com.alehenestroza;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 */
public class ProductOfArrayExceptSelf {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int[] result = new int[arrayLength];

        int prefix = 1;
        for (int i = 0; i < arrayLength; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = arrayLength - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
