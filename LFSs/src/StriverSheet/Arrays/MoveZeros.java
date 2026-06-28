package StriverSheet.Arrays;

import java.util.Arrays;

public class MoveZeros {

    //brute
    static void moveTheZeros(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length-1){
            arr[count++] = 0;
        }
    }

    //optimal
    static void moveZeros(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,4,0};
        moveTheZeros(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
