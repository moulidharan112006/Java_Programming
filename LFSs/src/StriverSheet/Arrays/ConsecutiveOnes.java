package StriverSheet.Arrays;

public class ConsecutiveOnes {
    static int consecutiveOnes(int[] arr){
        int max = 0,count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1) count++;
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(consecutiveOnes(arr));
    }
}
