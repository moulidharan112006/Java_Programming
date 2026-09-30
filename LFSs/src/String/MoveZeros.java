package String;

import java.util.Arrays;

public class MoveZeros {
    static int[] moveZero(int[] arr){
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[ind] = arr[i];
                ind++;
            }
        }
        while(ind < arr.length){
            arr[ind++] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12,0,5};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
