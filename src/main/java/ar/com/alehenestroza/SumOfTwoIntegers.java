package ar.com.alehenestroza;

/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.

Constraints:
-1000 <= a, b <= 1000

 */
public class SumOfTwoIntegers {

    // Time complexity: O(1) -> Constant time for values between a specific range (-1000 to 1000 in this case)
    public static int getSum(int a, int b) {
        while (b != 0) {
            int tmp = (a & b) << 1; // Get the carry values and shift by one (if no carry value, tmp will be 0 and loop will break
            a = a ^ b; // Get the XOR value of a and b (this will be almost like a regular SUM but won't take into account the carry values)
            b = tmp; // Assign the AND value to b and repeat the loop (if the AND value != 0)
        }

        return a;
    }
}
