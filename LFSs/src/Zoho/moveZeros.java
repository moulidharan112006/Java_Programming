package Zoho;

import java.util.Arrays;

public class moveZeros {
    static int[] moveZero(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,4,5};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
