package dynamicProgramming;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = { 2, 1, 2, 1, 0, 1, 2 };

		int profit = maxProfit(prices);
		System.out.println(profit);
	}

	private static int maxProfit(int[] prices) {

		int buy = prices[0];
		int profit = 0;

		for (int i = 0; i < prices.length; i++)

			if (buy > prices[i])
				buy = prices[i];

			else if (profit < prices[i] - buy)
				profit = prices[i] - buy;

		return profit;

	}
}
