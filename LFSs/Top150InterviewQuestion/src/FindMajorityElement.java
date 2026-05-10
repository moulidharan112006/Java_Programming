import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
    static int findMajority(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > arr.length/2) return e.getKey();
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(findMajority(arr));
    }
}
