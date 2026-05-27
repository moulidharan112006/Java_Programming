import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    static boolean wordBreak(String s,List<String> lst){
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(res[j] && lst.contains(s.substring(j,i))){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[s.length()];
    }
    public static void main(String[] args) {
        String s = "ilike";
        List<String> lst = new ArrayList<>(Arrays.asList("i", "like", "gfg"));
        System.out.println(wordBreak(s,lst));
    }
}
