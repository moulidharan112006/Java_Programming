import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    static String commonPrefix(String[] s){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        String s1 = s[0],s2 = s[s.length -1];
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i) != s2.charAt(i)) return sb.toString();
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(commonPrefix(s));
    }
}
