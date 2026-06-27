package StriverSheet.Arrays;

import java.util.Arrays;

public class LargestElement {

    //optimal
    static int findLargestElement(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    //brute force
    static int findLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,2};
        System.out.println(findLargestElement(arr));
        System.out.println(findLargest(arr));
    }
}
