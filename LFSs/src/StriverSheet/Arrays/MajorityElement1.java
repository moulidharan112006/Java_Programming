package StriverSheet.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    //better
    static int majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr) map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > arr.length/2){
                return e.getKey();
            }
        }
        return -1;
    }
    //optimal
    static int majorityElement1(int[] arr){
        int n = arr.length,count =0,element =0;
        for(int i=0;i<n;i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]) count++;
            else count--;
        }
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == element){
                count1++;
            }
        }
        if(count1 > n/2) return element;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement1(arr));
    }
}
