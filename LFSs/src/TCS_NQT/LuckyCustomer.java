package TCS_NQT;

public class LuckyCustomer {
    static int fibbonacci(int n){
        if(n <=1 )return n;
        return fibbonacci(n-1) + fibbonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibbonacci(n));
    }
}
