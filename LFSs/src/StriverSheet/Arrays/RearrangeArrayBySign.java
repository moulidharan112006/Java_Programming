package StriverSheet.Arrays;

import java.util.Arrays;

public class RearrangeArrayBySign {

    //optimal
    static int[] rearrangeArray(int[] arr){
        int[] temp = new int[arr.length];
        int pos = 0,neg = 1;
        for(int i=0;i< arr.length;i++){
            if(arr[i] >= 0){
                temp[pos] = arr[i];
                pos+=2;
            }
            else{
                temp[neg] = arr[i];
                neg+=2;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
