package Arrray;

import java.util.Arrays;

public class PassMark {
    static int passMark(int n,int p,int[] arr){
        Arrays.sort(arr);
        if(arr.length == p) return Math.max(0,arr[0] -1);
        else if(p == 0) return arr[n-1];
        return arr[n-p] - 1;
    }
    public static void main(String[] args) {
        int n = 4,p=2;
        int[] arr = {5,1,7,4};
        System.out.println(passMark(n,p,arr));
    }
}
