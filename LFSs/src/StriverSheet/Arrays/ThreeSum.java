package StriverSheet.Arrays;

import java.sql.Array;
import java.util.*;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> lst = new ArrayList<>();
                        lst.add(arr[i]);
                        lst.add(arr[j]);
                        lst.add(arr[k]);
                        Collections.sort(lst);
                        if(!res.contains(lst)) res.add(lst);
                    }
                }
            }
        }
        return res;
    }

    //better
    static List<List<Integer>> threeSumBetter(int[] arr){
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j< arr.length;j++){
                int third = -(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    res.add(temp);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(res);
    }

    //Optimal
    static List<List<Integer>> threeSumOptimal(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int left = i+1,right = arr.length-1;
            while(left < right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left-1]) left++;
                    while (left < right && arr[right] == arr[right+1]) right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,4};
        List<List<Integer>> ans1 = threeSum(arr);
        for(List<Integer> l : ans1){
            System.out.println(l);
        }
        System.out.println();
        List<List<Integer>> ans2 = threeSumBetter(arr);
        for(List<Integer> l : ans2){
            System.out.println(l);
        }
        System.out.println();
        List<List<Integer>> ans3 = threeSumOptimal(arr);
        for(List<Integer> l : ans3){
            System.out.println(l);
        }
    }
}
