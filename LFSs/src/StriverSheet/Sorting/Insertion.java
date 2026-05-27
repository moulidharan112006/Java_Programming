package StriverSheet.Sorting;

import java.util.Arrays;

public class Insertion {
    static int[] insertion(int[] arr){
        for(int i=1;i< arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,4,1,1};
        System.out.println(Arrays.toString(insertion(arr)));
    }
}
