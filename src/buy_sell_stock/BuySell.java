package buy_sell_stock;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class BuySell {

    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};
        int buy = 0;
        int profit = 0;
        int sell = 1;
        while(buy < prices.length && sell < prices.length){
            if(prices[buy] < prices[sell]){
                int diff = prices[sell] - prices[buy];
                profit = Math.max(profit,diff);
            } else{
                buy+=1;
                sell = buy;
            }
            sell+=1;
        }
        System.out.println("Final profit is"+profit);
    }
}
