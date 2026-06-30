package StriverSheet.Arrays;

public class StockBuyandSell {

    //brute
    static int buyAndSell(int[] arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[j] - arr[i];
                if(max < sum) max = sum;
            }
        }
        return max;
    }

    //optimal
    static int buyAndSellOptimal(int[] arr){
        int max =0,min=arr[0];
        for(int i=0;i<arr.length;i++){
            int price = arr[i] - min;
            max = Math.max(max,price);
            min = Math.min(min,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buyAndSell(arr));
        System.out.println(buyAndSellOptimal(arr));
    }
}
