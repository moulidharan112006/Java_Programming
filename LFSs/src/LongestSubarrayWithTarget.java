import java.util.HashMap;

public class LongestSubarrayWithTarget {
    //Brute Force
    static int longestSubarray(int[] arr,int k){
        int maxlen =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
                if(sum == k) maxlen = Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }

    //Better
    static int bLongestSubarray(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen =0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k) maxlen = i +1;
            else if(map.containsKey(sum - k)){
                maxlen = Math.max(maxlen,i - map.get(sum - k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        System.out.println(longestSubarray(arr,k));
        System.out.println(bLongestSubarray(arr,k));
    }
}
