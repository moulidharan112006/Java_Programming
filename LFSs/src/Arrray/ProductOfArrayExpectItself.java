package Arrray;

public class ProductOfArrayExpectItself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0] = 1;
        sufix[n-1] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i=n-2;i>=0;i--){
            sufix[i] = sufix[i + 1] * nums[i + 1];
        }
        int[] res = new int[nums.length];
        for(int i=0;i<n;i++){
            res[i] = sufix[i] * prefix[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = productExceptSelf(arr);
        for(int i=0;i<res.length;i++) System.out.print(res[i]+" ");
    }
}
