package StriverSheet.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    //better
    static int longestConsecutive(int[] arr){
        int max =1,count =1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] + 1 == arr[i + 1]) count++;
            else{
                max =Math.max(max, count);
                count = 1;
            }
        }
        max =Math.max(max, count);
        return max;
    }

    //optimal
    static int longestConsecutiveSequence(int[] arr){
        int longest =1;
        if(arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int count = 1;
                while (set.contains(n+1)){
                    count+=1;
                    n = n+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));
        System.out.println(longestConsecutiveSequence(arr));
    }
}
