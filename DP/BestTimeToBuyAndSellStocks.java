/***

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.



Here we take two pointers, left pointer starting from the 0th index and the right pointer starting next to the left pointer. We only find the difference if right is bigger than small pointer.
else we make the right pointer as the left pointer.

***/




class Solution {
    public int maxProfit(int[] prices) {
        int L=0;
        int R=1;
        int maxP=0;
        while(R<prices.length){
            if(prices[L]<prices[R])
            {
                int profit=prices[R]-prices[L];
                maxP=Math.max(profit, maxP);
            }
            else{
                L=R;
            }
            R++;
        }
        return maxP;
    }
}
