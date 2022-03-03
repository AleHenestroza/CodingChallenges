package ar.com.alehenestroza;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

	@Test
	void test_maxProduct_case1() {
		int[] array = { 2, 3, -2, 4 };
		assertEquals(6, MaximumProductSubarray.maxProduct(array));
	}

	@Test
	void test_maxProduct_case2() {
		int[] array = { -2, 0, -1 };
		assertEquals(0, MaximumProductSubarray.maxProduct(array));
	}

}
