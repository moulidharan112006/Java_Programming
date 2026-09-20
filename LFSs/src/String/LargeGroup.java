package String;

public class LargeGroup {
    static int findLargeGroup(String s){
        int star =0,maxLen =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '@' || s.charAt(i) == '$'){
                maxLen = Math.max(maxLen,i-star+1);
                star = i+1;
            }
        }
        if(s.length() - star+1 > maxLen) maxLen = s.length() - star+1;
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "PPPPPP@PPP@PP$PP";
        System.out.print(findLargeGroup(s));
    }
}
