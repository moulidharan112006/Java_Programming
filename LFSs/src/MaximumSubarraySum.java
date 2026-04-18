public class MaximumSubarraySum {
    // Brute Force
    static int maxiSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    // Kadane's Algorithm
    static int bMaxiSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            end = Math.max(end+arr[i],arr[i]);
            maxSum = Math.max(maxSum,end);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxiSum(arr));
        System.out.println(bMaxiSum(arr));
    }
}
