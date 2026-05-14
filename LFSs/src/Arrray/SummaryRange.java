package Arrray;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static List<String> summaryRanges(int[] nums) {
        List<String> lst = new ArrayList<>();
        if(nums.length ==0 ) return lst;
        int l =0, r = 0;
        while(r < nums.length-1){
            if(nums[r]+1 == nums[r+1]){
                r++;
            }
            else{
                if(l == r){
                    lst.add(String.valueOf(nums[l]));
                    l=r+1;
                    r = l;
                }
                else{
                    lst.add(nums[l]+"->"+nums[r]);
                    l = r+1;
                    r = l;
                }
            }
        }
        if(l == r){
            lst.add(String.valueOf(nums[r]));
        }
        else{
            lst.add(nums[l]+"->"+nums[r]);
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        List<String> res = summaryRanges(arr);
        System.out.println(res);
    }
}
