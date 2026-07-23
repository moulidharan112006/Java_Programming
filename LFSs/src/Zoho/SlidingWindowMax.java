package Zoho;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMax {
    static int maxInWindow(int[] arr,int start,int end){
        int max = 0;
        for(int i=start;i<end;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    static List<Integer> windowMax(int[] arr,int k){
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            lst.add(maxInWindow(arr,i,i+k));
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,5,2,6,2,4,8,9};
        int k = 3;
        List<Integer> res = windowMax(arr,k);
        System.out.println(res);
    }
}
