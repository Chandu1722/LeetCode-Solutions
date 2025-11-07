class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, prevSell = 0, buy = Integer.MIN_VALUE, prevBuy;
        for (int n : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - n, prevBuy);
            prevSell = sell;
            sell = Math.max(prevBuy + n, prevSell);
        }
        return sell;
    }
}
