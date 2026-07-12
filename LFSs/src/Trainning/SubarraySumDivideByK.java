package Trainning;

public class SubarraySumDivideByK {
    static int subarrayDivideByK(int[] arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum%k==0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,0,-2,-3,1};
        int k = 5;
        System.out.println(subarrayDivideByK(arr,k));
    }
}
