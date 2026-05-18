package StriverSheet.Hashing;

import java.util.HashMap;

public class HighestOccurance {
    static int[] occurance(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxFre = 0
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        int[] res = occurance(arr);
        for(int i : res) System.out.print(i+" ");
    }
}
