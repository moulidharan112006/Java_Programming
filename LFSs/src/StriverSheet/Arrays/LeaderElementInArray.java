package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderElementInArray {

    //brute
    static int[] leaderElement(int[] arr){
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean isFound = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    isFound = false;
                    break;
                }
            }
            if(isFound) lst.add(arr[i]);
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }

    //optima
    static int[] leaderOfArray(int[] arr){
        List<Integer> lst = new ArrayList<>();
        lst.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > max){
                lst.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(lst);
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        System.out.println(Arrays.toString(leaderElement(arr)));
        System.out.println(Arrays.toString(leaderOfArray(arr)));
    }
}
