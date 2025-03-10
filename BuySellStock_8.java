package meta;

public class BuySellStock_8 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit possible with less than 2 prices
        }

        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i]; // Update buy price if a lower price is found
            } else {
                int currentProfit = prices[i] - buyPrice; // Calculate profit
                profit = Math.max(profit, currentProfit); // Update max profit
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BuySellStock_8 stock = new BuySellStock_8();
        int[] prices = {3,2,6,5,0,3}; // Example input

        int maxProfit = stock.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
