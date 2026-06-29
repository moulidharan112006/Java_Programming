package StriverSheet.Arrays;

import java.util.HashMap;
import java.util.Map;

public class AppearanceOnce {

    //better
    static int appearOnce(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr) map.put(n,map.getOrDefault(n,0)+1);
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1) return e.getKey();
        }
        return -1;
    }

    //optimal
    static int occurrence(int[] arr){
        int num = 0;
        for(int n : arr){
            num = num ^ n;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(appearOnce(arr));
        System.out.println(occurrence(arr));
    }
}
