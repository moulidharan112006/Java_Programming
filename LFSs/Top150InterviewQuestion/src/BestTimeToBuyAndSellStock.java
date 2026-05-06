public class BestTimeToBuyAndSellStock {
    static int bestTime(int[] arr){
        int max =0,min = arr[0];
        for(int i=0;i<arr.length;i++){
            int cost = arr[i] - min;
            max = Math.max(max,cost);
            min = Math.min(min,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bestTime(arr));
    }
}
