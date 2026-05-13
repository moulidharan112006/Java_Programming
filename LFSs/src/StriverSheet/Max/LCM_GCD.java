package StriverSheet.Max;

public class LCM_GCD {
    static int gcd(int n,int m){
        int max =0;
        int maxValue = Math.min(n,m);
        for(int i = 1;i<=maxValue;i++){
            if(n%i ==0 && m%i==0) max = Math.max(i,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 9,m=12;
        System.out.println(gcd(n,m));
    }
}
