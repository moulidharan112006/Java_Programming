package StriverSheet.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
    static void merge(int[] arr,int low,int mid,int high){
        int left = low, right = mid+1,ind =0;
        int[] temp = new int[high+1];
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[ind++] = arr[left++];
            }
            else{
                temp[ind++] = arr[right++];
            }
        }
        while (left <= mid){
            temp[ind++] = arr[left++];
        }
        while (right <= high){
            temp[ind++] = arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,9,1,4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
