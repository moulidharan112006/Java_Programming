package Trainning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecuseBoats {
    static int numOfRecuseBoats(int[] arr,int limit){
        List<List<Integer>> res = new ArrayList<>();
        int left = 0,right = 0;
        int sum = 0,count = 0;
        while(right < arr.length){
            sum+=arr[right];
            if(sum == limit){
                List<Integer> lst = new ArrayList<>();
                while (left<=right){
                    lst.add(arr[left]);
                    sum-=arr[left];
                    left++;
                }
                res.add(lst);
                count++;
            }
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        int limit = 3;
        System.out.println(numOfRecuseBoats(arr,limit));
    }
}
