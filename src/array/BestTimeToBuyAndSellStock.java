package array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 1 };

		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {

		int profit = 0;

		int currentStock = prices[0];
		if (prices.length >= 1)
			for (int i = 1; i < prices.length; i++) {

				if (currentStock < prices[i])
					profit += prices[i] - currentStock;

				currentStock = prices[i];
			}
		return profit;
	}
}
