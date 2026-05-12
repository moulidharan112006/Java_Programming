package Arrray;

import java.util.HashMap;

public class CountSubArrayWithTarget {

    //Brute Force
    static int countSubarray(int[] arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum =arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum == k) count++;
            }
        }
        return count;
    }

    //Better
    static int bCountSubarray(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,count =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k) count++;
            if(map.containsKey(sum - k)){
                count+=map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarray(arr,k));
        System.out.println(bCountSubarray(arr,k));
    }
}
