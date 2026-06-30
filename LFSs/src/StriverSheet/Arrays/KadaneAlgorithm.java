package StriverSheet.Arrays;

public class KadaneAlgorithm {
    //brute
    static int maximumSum(int[] arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(max < sum) max = sum;
            }
        }
        return max;
    }

    //optimal
    static int maximumSumOptimal(int[] arr){
        int max= 0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum > max) max = sum;
            if(sum  < 0) sum =0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        System.out.println(maximumSum(arr));
        System.out.println(maximumSumOptimal(arr));
    }
}
