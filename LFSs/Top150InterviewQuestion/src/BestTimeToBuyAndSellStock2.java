public class BestTimeToBuyAndSellStock2 {
    static int bestProfit(int[] arr){
        int profit =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                profit+=arr[i+1] - arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bestProfit(arr));
    }
}
