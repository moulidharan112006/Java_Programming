package StriverSheet.Arrays;

import java.util.Arrays;

public class MissingNumber {
    //brute
    static int findTheMissingNumber(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1 != arr[i+1]) return arr[i]+1;
        }
        return arr[arr.length - 1]+1;
    }

    //optimal
    static int missingNumber(int[] arr){
        int n = arr.length+1,sum=0;
        for(int i=0;i< arr.length;i++) sum+=arr[i];
        int expSum = (n * (n+1))/ 2;
        return expSum - sum;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,3,1,4,6,7};
        System.out.println(findTheMissingNumber(arr));
        System.out.println(missingNumber(arr));
    }
}
