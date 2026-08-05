package StriverSheet.Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    //brute force
    static List<List<Integer>> mergeList(int[][] arr){
        Arrays.sort(arr,(a,b) -> (a[0] - b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int i=0,n=arr.length;
        while(i < n){
            int start = arr[i][0];
            int end = arr[i][1];
            int j = i+1;
            while (j<n && end >= arr[j][0]){
                end = Math.max(end,arr[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));
            i=j;
        }
        return ans;
    }
    //optimal
    static List<List<Integer>> mergeInterval(int[][] arr){
        Arrays.sort(arr,(int[] a,int[] b) -> (a[0]-b[0]));
        List<List<Integer>> merge = new ArrayList<>();
        for(int[] interval : arr){
            if(merge.isEmpty() || merge.get(merge.size()-1).get(1) < interval[0]){
                merge.add(Arrays.asList(interval[0],interval[1]));
            }
            else{
                int last = merge.size()-1;
                int maxEnd = Math.max(merge.get(last).get(1),interval[1]);
                merge.get(last).set(1,maxEnd);
            }
        }
        return merge;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> res = mergeList(arr);
        for(List<Integer> lst : res){
            System.out.println(lst);
        }
        List<List<Integer>> res2 = mergeInterval(arr);
        for(List<Integer> lst : res2){
            System.out.println(lst);
        }
    }
}
