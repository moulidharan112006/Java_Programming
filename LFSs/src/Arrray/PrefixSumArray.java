package Arrray;

public class PrefixSumArray {
    static void prefixSum(int[] arr){
        for(int i=1;i< arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        prefixSum(arr);
        for(int i=0;i< arr.length;i++) System.out.print(arr[i]+" ");
    }
}
