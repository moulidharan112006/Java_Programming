package Zoho;

public class ExpandString {
    static String expandTheString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                for(int j=0;j<s.charAt(i)-'0';j++){
                    sb.append(s.charAt(i-1));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a1b6c4d2";
        System.out.println(expandTheString(s));
    }
}
