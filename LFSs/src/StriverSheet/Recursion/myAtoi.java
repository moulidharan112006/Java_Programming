package StriverSheet.Recursion;

public class myAtoi {
    static final int minVal = Integer.MIN_VALUE;
    static final int maxVal = Integer.MAX_VALUE;
    static int myAtoiNum(String s,int ind,long val,int sign){
        if(ind >= s.length() || !Character.isDigit(s.charAt(ind))){
            return (int) (sign*val);
        }
        val=(val*10)+(s.charAt(ind)-'0');
        if((sign*val) <= minVal) return minVal;
        if((sign*val) >= maxVal) return maxVal;
        return myAtoiNum(s,ind+1,val,sign);
    }
    public static void main(String[] args) {
        String s = " -12345";
        int ind =0,sign =1;
        while(ind < s.length() && s.charAt(ind) == ' ') ind++;
        while (ind < s.length() && (s.charAt(ind) == '+' || s.charAt(ind) == '-')){
            sign = (s.charAt(ind)=='-')?-1:1;
            ind++;
        }
        System.out.print(myAtoiNum(s,ind,0,sign));
    }
}
