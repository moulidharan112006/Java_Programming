package StriverSheet.Arrays;

import java.util.Arrays;

public class RotateArrayByKPlace {
    static void rotateArray(int[] arr,int left,int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2%arr.length;
        rotateArray(arr,0,arr.length-1);
        rotateArray(arr,0,k-1);
        rotateArray(arr,k,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
