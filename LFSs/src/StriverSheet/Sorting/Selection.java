package StriverSheet.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    static int[] selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7,5,9,2,8};
        System.out.println(Arrays.toString(selection(arr)));
    }
}
