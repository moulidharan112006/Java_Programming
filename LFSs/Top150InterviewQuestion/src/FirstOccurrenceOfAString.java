public class FirstOccurrenceOfAString {
    static int occurrence(String s,String p){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(p.equals(s.substring(i,j))) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        String p = "leeto";
        System.out.println(occurrence(s,p));
    }
}
