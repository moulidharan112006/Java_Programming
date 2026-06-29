package StriverSheet.Arrays;

import java.util.Map;

public class LongestSubarrayWithGivenSum {
    //brute
    static int longestSubarry(int[] arr,int k){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int sum =arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum == k) max = Math.max(max,j-i+1);
            }
        }
        return  max;
    }

    //optimal
    static int longestSubarrayWithK(int[] arr,int k){
        int max =0,left =0,right =0,sum = arr[0];
        while(right < arr.length){
            while (left <= right && sum > k){
                sum -=arr[left];
                left++;
            }
            if(sum == k) max = Math.max(max,right - left +1);
            right++;
            if(right < arr.length){
                sum+=arr[right];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarry(arr,k));
        System.out.println(longestSubarrayWithK(arr,k));
    }
}
