package String;

import java.util.Scanner;
public class RatanProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
}
