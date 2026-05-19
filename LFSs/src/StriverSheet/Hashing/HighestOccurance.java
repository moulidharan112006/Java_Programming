package StriverSheet.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurance {
    static void occurance(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxFre = 0,minFre = arr.length, maxEle = 0,minEle = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int element = e.getKey();
            int count = e.getValue();
            if(count > maxFre){
                maxFre = count;
                maxEle = element;
            }
            if(count < minFre){
                minFre = count;
                minEle = element;
            }
        }
        System.out.println("MaxFre: "+maxEle);
        System.out.println("MinFre: "+minEle);
    }
    public static void main(String[] args) {
        int[] arr = {10,12,12,3,14,14};
        occurance(arr);
    }
}
