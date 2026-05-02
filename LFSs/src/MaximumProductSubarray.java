public class MaximumProductSubarray {
    static int maxProduct(int[] arr) {
        int  max=arr[0], min = arr[0], ans= arr[0];
        for(int i=1;i<arr.length;i++){
            int temp =max;
            max = Math.max(arr[i],Math.max(max*arr[i], min*arr[i]));
            min = Math.min(arr[i],Math.min(temp*arr[i], min*arr[i]));
            ans = Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
