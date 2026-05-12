package Arrray;

import java.util.Arrays;

public class NextPermutation {
    static void swap(int[] arr,int left,int right){
        int temp =arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void reverse(int[] arr,int left,int right){
        while(left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    static void permutation(int[] arr){
        int i= arr.length - 1;
        while (i > 0 && arr[i-1] >= arr[i]) i--;
        if(i == 0){
            reverse(arr,0,arr.length -1);
            return;
        }
        int j= arr.length-1;
        while (j >= i && arr[j] <= arr[i-1]) j--;
        swap(arr,i-1,j);
        reverse(arr,i,arr.length -1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
