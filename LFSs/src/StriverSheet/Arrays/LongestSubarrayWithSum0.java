package StriverSheet.Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSum0 {
    static int logestSubarrayWithSum0(int[] arr){
        int max =0,sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0){
                max = i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max = Math.max(max,i -map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(logestSubarrayWithSum0(arr));
    }
}
