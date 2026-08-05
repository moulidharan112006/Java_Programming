package StriverSheet.Arrays;

import java.util.HashMap;

public class CountSubarrayXOR {

    //brute
    static int countSubarray(int[] arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int xor = 0;
            for(int j=i;j<arr.length;j++){
                xor^=arr[j];
                if(xor == k) count++;
            }
        }
        return count;
    }

    //optimal
    static int countSubarrayOptimal(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixXor = 0,count =0;
        for(int num : arr){
            prefixXor^=num;
            int target = prefixXor ^ k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countSubarray(arr,k));
        System.out.println(countSubarrayOptimal(arr,k));
    }
}
