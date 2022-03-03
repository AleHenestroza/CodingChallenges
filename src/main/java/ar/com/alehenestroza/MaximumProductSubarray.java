package ar.com.alehenestroza;

/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
A subarray is a contiguous subsequence of the array.

Constraints:
1.	1 <= nums.length <= 2 * 104
2.	-10 <= nums[i] <= 10
3.	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 */
public class MaximumProductSubarray {

	// Time complexity: O(n)
	// Space complexity: O(1)
	public static int maxProduct(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int result = nums[0], max = nums[0], min = nums[0];

		// Traverse the array (we don't start at index 0, because this is already being
		// stored on min, max and result
		for (int i = 1; i < nums.length; i++) {
			int temp = max;
			// The max will be either the current number, or the product of the current
			// number and the previous max or min
			max = Integer.max(nums[i], Integer.max(nums[i] * max, nums[i] * min));
			// Perform the same operation for the minimum
			min = Integer.min(nums[i], Integer.min(nums[i] * min, nums[i] * temp));

			// The result will update with the maximum of the previous result and the
			// current max
			result = Integer.max(result, max);
		}

		return result;
	}

}
