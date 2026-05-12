package Arrray;

import java.util.*;


public class FindMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);

        int i=1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
}
