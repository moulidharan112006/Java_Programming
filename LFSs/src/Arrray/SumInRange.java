package Arrray;

public class SumInRange {
    static int findSum(int[] arr,int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 1, 6, 7};
        int l = 2,r = 5;
        System.out.println(findSum(arr,l,r));
    }
}
