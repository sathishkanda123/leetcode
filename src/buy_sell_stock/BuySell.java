package buy_sell_stock;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class BuySell {

    public static void main(String[] args) {

        int prices[] = {7,6,4,3,1};
        int buy = 0;
        int profit = 0;
        int sell = 1;
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int diff = prices[sell] - prices[buy];
                profit = Math.max(profit,diff);
            } else{
                buy++;
            }
            sell++;
        }
        System.out.println("Final buy is"+ buy);
        System.out.println("Final sell is"+ sell);
        System.out.println("Final profit is"+profit);
    }
}
