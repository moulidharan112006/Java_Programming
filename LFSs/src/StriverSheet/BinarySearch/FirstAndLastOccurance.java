package StriverSheet.BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {
    //brute
    static int[] firstAndLast(int[] arr,int target){
        int[] res = new int[]{-1,-1};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] == target && arr[i]!=target){
                res[0] = i+1;
                res[1] = i+1;
            }
            else if(arr[i]==target && arr[i+1]!=target) res[1] = i;
        }
        return res;
    }

    //optimal
    static int lastOptimal(int[] arr,int target){
        int res = 0, start = 0, end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid+1;
            }
            else if(arr[mid] < target) start = mid+1;
            else if(arr[mid] > target) end = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,9};
        int target = 8;
        System.out.println(Arrays.toString(firstAndLast(arr,target)));
        System.out.println(lastOptimal(arr,target));
    }
}
