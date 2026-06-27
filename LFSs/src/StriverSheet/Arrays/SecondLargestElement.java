package StriverSheet.Arrays;

import java.util.Arrays;

public class SecondLargestElement {

    //optimal
    static int findSecondLargestElement(int[] arr){
        int large = arr[0],prev = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < large && arr[i] > prev) prev = arr[i];
            else if(arr[i] > large){
                prev = large;
                large = arr[i];
            }
        }
        return prev;
    }

    //brute
    static int findSecondLargest(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        for(int i = arr.length - 2;i>=0;i--){
            if(arr[i] != arr[i+1]){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,5,5};
        System.out.println(findSecondLargestElement(arr));
        System.out.println(findSecondLargest(arr));
    }
}
