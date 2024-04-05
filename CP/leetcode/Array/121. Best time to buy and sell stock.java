class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int diff=prices[i]-minbuy; //at each iteration local profit in the form of difference is calculated
            profit=Math.max(diff,profit);//profit has to be maximised
            minbuy=Math.min(minbuy,prices[i]);//buy or purchase price has to be minimum

        }
        return profit;
    }
}