package TCS_NQT;

public class StringEncryption {
    static char encryption(String s1,String s2){
        int i = 0;
        while (i < s1.length() && i < s2.length()){
            if(s1.charAt(i) != s2.charAt(i)) return s1.charAt(i);
            i++;
        }
        while (i < s1.length()){
            return s1.charAt(i);
        }
        return '_';
    }
    public static void main(String[] args) {
        String s1 = "abcdefghij";
        String s2 = "abcdefghi";
        System.out.println(encryption(s1,s2));
    }
}
