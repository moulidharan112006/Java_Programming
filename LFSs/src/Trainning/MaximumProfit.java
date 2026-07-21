package Trainning;

public class MaximumProfit {
    static int maximumProfit(int[] arr){
        int max = 0,min = arr[0];
        for(int i=0;i<arr.length;i++){
            int profit = arr[i] - min;
            max = Math.max(max,profit);
            min = Math.min(min,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,2};
        System.out.println(maximumProfit(arr));
    }
}
