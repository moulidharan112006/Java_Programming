import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {
    //brute force
    static boolean threeSum(int[] arr,int target){
        for(int i=0;i<arr.length - 2;i++){
            for(int j=i+1;j< arr.length -1;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //better

    static boolean bThreeSum(int[] arr,int target){
        for(int i=0;i< arr.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j< arr.length;j++){
                int rem = target - arr[i] - arr[j];
                if(set.contains(rem)){
                    return true;
                }
                set.add(arr[j]);
            }
        }
        return false;
    }

    // Optimal
    static boolean oThreeSum(int[] arr,int target){
        Arrays.sort(arr);
        for(int i=0;i< arr.length -1;i++){
            int l = i +1,r=arr.length -1;
            int req = target - arr[i];
            while (l < r){
                if(arr[l] + arr[r] == req) return true;
                else if(arr[l] +arr[r] < req) l++;
                else if(arr[l] + arr[r] > req)  r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(threeSum(arr,target));
        System.out.println(bThreeSum(arr,target));
        System.out.println(oThreeSum(arr,target));
    }
}
