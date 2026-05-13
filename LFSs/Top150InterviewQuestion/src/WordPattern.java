import java.util.HashMap;

public class WordPattern {
    static boolean pattern(String s,String p){
        char[] c = s.toCharArray();
        String[] str = p.split(" ");
        if(c.length != str.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<str.length;i++){
            if(map.containsKey(c[i])) {
                if (!str[i].equals(map.get(c[i]))) return false;
            }
            else if(map.containsValue(str[i])) return false;
            map.put(c[i], str[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        String p = "dog cat cat dog";
        System.out.println(pattern(s,p));
    }
}
