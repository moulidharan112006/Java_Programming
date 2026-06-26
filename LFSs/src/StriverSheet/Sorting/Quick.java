package StriverSheet.Sorting;

import java.util.Arrays;

public class Quick {
    static int sort(int[] arr,int low,int high){
        int pivot = arr[low],i = low,j = high;
        while (i < j){
            while (arr[i] <= pivot && i<=high-1){
                i++;
            }
            while (arr[j] > pivot && j>=low+1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low > high) return;
        int partition = sort(arr,low,high);
        quickSort(arr,low,partition-1);
        quickSort(arr,partition+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,9,6,7,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
