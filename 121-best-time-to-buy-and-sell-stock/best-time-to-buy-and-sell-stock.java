class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] - prices[i] < 0)
                i=j;
            else if (prices[j] - prices[i] > profit)
                profit = prices[j] - prices[i];
        }
        return profit;
    }
}