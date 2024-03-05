/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future 
to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
import java.util.*;
class BestTimeToBuySellStock
{
public static int buySell(int prices[])
{
    int buyMin=prices[0];
    int profit=0;
    for(int i=1;i<prices.length;i++)
    {
        int diff=prices[i]-buyMin; //at each iteration local profit in the form of difference is calculated
        profit=Math.max(profit,diff); //profit has to be maximised
        buyMin=Math.min(buyMin,prices[i]); //buy or purchase price has to be minimum


    }
    return profit;
}
public static void main(String args[])
{
    int prices[]={7,1,5,3,6,4};
    System.out.println("Maximum profit: "+buySell(prices));
}
}
/* 
 output: Maximum profit: 5
 */