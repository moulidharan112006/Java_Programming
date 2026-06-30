package StriverSheet.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //brute
    static boolean twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target) return true;
            }
        }
        return false;
    }

    //better
    static int[] twoSumBetter(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }

    //optimal
    static boolean twoSumOptimal(int[] arr,int target){
        int left =0,right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target) return true;
            else if(sum > target){
                sum -= arr[right--];
            }
            else{
                sum -= arr[left];
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 15;
        System.out.println(twoSum(arr,target)?"Yes":"No");
        System.out.println(Arrays.toString(twoSumBetter(arr,target)));
        System.out.println(twoSumOptimal(arr,target)?"Yes":"No");
    }
}
