package Arrray;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int n = res.size();
            for (int j = 0; j < n; j++) {
                List<Integer> lst = new ArrayList<>(res.get(j));
                lst.add(nums[i]);
                res.add(lst);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> r = subsets(arr);
        for(List<Integer> n : r){
            System.out.print(n);
        }
    }
}
