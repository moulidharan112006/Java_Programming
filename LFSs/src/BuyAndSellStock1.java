public class BuyAndSellStock1 {
    static int maxProfit(int[] arr){
        int max =0,min = arr[0];
        for(int i=0;i<arr.length;i++){
            int cost = arr[i] - min;
            max = Math.max(max,cost);
            min = Math.min(min,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(arr));
    }
}
