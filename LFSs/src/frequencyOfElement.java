import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class frequencyOfElement {

    // Brute Force
    static void findFrequency(int[] arr){
        int max = arr[0];
        for(int n : arr){
            max = Math.max(max,n);
        }
        int[] fre = new int[max+1];
        for(int i =0;i< arr.length;i++){
            fre[arr[i]]++;
        }

        for(int i=0;i< fre.length;i++){
            if(fre[i] != 0) System.out.println(i +" " + fre[i]);
        }
    }

    // optimal
    static void oFrequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 20};
        findFrequency(arr);
        oFrequency(arr);
    }
}
