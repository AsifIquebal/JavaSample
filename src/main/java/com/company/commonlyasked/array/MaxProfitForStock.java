package com.company.commonlyasked.array;

public class MaxProfitForStock {
    static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int j = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                j = i;
            }
            if ((prices[i] >= prices[i - 1])) {
                if ((i + 1 == prices.length)||(prices[i] > prices[i + 1])) {
                    int profit = prices[i] - prices[j];
                    System.out.println("Buy on day " + (j + 1) + " and sell on day " + (i + 1) + " with profit:" + profit);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int[] prices = {20, 100, 180, 260, 710,15, 535, 695, 500};
        int[] prices = {1, 5, 2, 3, 7, 6, 4, 5};
        System.out.println(maxProfit1(prices));
    }

}

/*
 *  the increasing sequences of length 2 or more in the array {1, 5, 2, 3, 7, 6, 4, 5}
 * are {1, 5}, {2, 3, 7}, and {4, 5}.
 * The local minimum of each sequence is 1, 2 and 4, respectively.
 * We can gain maximum profit if we buy the shares at the starting of every increasing sequence (local minimum)
 * and sell them at the end of the increasing sequence (local maximum).*/
