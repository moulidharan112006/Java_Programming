package Trainning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    static int[] plusOne(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] < 9){
                arr[i] = arr[i]+1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] res = new int[arr.length+1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
