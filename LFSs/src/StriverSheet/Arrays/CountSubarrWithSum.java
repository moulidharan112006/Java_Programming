package StriverSheet.Arrays;

import java.util.HashMap;

public class CountSubarrWithSum {
    static int subarrayCount(int[] arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            if(arr[i] == k) count++;
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum ==k) count++;
            }
        }
        return count;
    }
    static int countOfSubarray(int[] arr,int k){
        int count = 0,sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remove = sum - k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k = 6;
        System.out.println(subarrayCount(arr,k));
        System.out.println(countOfSubarray(arr,k));
    }
}
