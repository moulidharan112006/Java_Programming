package Arrray;

import java.util.Arrays;

public class MaximumGap {
    static int maxDiff(int[] arr) {
        Arrays.sort(arr);
        int maxGap =0;
        for(int i=1;i<arr.length;i++){
            maxGap = Math.max(maxGap,arr[i] - arr[i-1]);
        }
        return maxGap;
    }
    public static void main(String[] args) {
        int[] arr = {1,10,5};
        System.out.println(maxDiff(arr));
    }
}
