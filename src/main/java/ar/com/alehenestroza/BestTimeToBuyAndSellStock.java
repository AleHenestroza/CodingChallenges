package ar.com.alehenestroza;

/*
You are given an array prices where prices[i] is the price of a given stock on day i.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104

*/
public class BestTimeToBuyAndSellStock {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int bestTimeToBuyAndSell(int[] prices) {
        // We need two pointers, one to keep track of the lowest price and one to traverse the array
        int leftPtr = 0, rightPtr = 0, maxProfit = 0;

        // Traverse the array
        while (rightPtr < prices.length) {
            if (prices[rightPtr] < prices[leftPtr]) {
                leftPtr = rightPtr;
            }
            // Calculate the max between the current profit and the current price minus the lowest price
            maxProfit = Math.max(maxProfit, prices[rightPtr] - prices[leftPtr]); // Only the max between both arguments will be stored on maxProfit

            rightPtr++;
        }

        return maxProfit;
    }
}
