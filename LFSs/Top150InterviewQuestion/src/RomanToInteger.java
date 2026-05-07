import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static int romanToInteger(String s){
        Map<Character,Integer> map = Map.of('I',1,'v',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int res = 0;
        for(int i=0;i<s.length();i++){
            int curr = map.get(s.charAt(i));
            int next = (i+1 < s.length())? map.get(s.charAt(i+1)): 0;
            if(curr < next) res-=curr;
            else res+=curr;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "XXXIC";
        System.out.println(romanToInteger(s));
    }
}
