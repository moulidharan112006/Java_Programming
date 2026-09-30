package String;

public class DigitSum {
    static String checkBalance(long n){
        int digit = 0;
        long temp = n;
        while(temp > 0){
            digit++;
            temp/=10;
        }
        int half = digit/2;
        long divisor = 1;
        for(int i=0;i<half;i++){
            divisor*=10;
        }
        System.out.println(divisor);
        long right = n%divisor;
        long left = n/divisor;
        System.out.println(right +"  "+left);
        if(digit%2!=0){
            left/=10;
        }

        int leftSum =0,rightSum =0;
        while(left > 0){
            leftSum+=left%10;
            left/=10;
        }
        while (right > 0){
            rightSum+=right%10;
            right/=10;
        }

        return (leftSum == rightSum)?"Balance":"Not Balance";
    }
    public static void main(String[] args) {
        long n = 1234321;
        System.out.println(checkBalance(n));
    }
}
