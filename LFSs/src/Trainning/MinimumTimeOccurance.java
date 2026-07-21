package Trainning;

import java.util.HashMap;
import java.util.Map;

public class MinimumTimeOccurance {
    static char minimumOccuranceChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        char res = '\0';
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() < min){
                min = e.getValue();
                res = e.getKey();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "anvgaaanggvv";
        System.out.println(minimumOccuranceChar(s));
    }
}
