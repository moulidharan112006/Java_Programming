package StriverSheet.Arrays;

import java.util.Arrays;

public class LeftRoatateBy1 {
    static void leftRotate(int[] arr,int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotate(arr,0,1-1);
        leftRotate(arr,1,arr.length-1);
        leftRotate(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
