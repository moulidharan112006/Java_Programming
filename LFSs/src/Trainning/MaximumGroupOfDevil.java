package Trainning;

public class MaximumGroupOfDevil {
    static int maximumDevilGroup(String s){
        int max =0,startInd = 0,endInd = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '@' || s.charAt(i) == '$'){
                endInd = i;
                max = Math.max(max,endInd-startInd);
                startInd = i+1;
            }
        }
        if(s.charAt(s.length()-1) != '@' || s.charAt(s.length()-1)!='$'){
            max = Math.max(max,s.length()-1 - startInd);
        }
        return max+1;
    }
    public static void main(String[] args) {
        String s = "PPPPPP@PPP@PP$PP";
        System.out.println(maximumDevilGroup(s));
    }
}
