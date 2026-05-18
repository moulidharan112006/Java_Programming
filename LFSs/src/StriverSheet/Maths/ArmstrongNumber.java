package StriverSheet.Maths;

public class ArmstrongNumber {
    static int sumOfTheNumber(int n,int len){
        int sum =0;
        while(n > 0){
            int rem = n%10;
            int temp = len;
            int product = 1;
            while (temp > 0){
                product*=rem;
                temp--;
            }
            sum+=product;
            n/=10;
        }
        return sum;
    }
    static int lenghtOfDigit(int n){
        int count = 0;
        while (n > 0){
            count++;
            n/=10;
        }
        return count;
    }
    static int isArmstrong(int n){
        int len = lenghtOfDigit(n);
        return sumOfTheNumber(n,len);
    }
    public static void main(String[] args) {
        int n = 371;
        int ans = isArmstrong(n);
        if(ans == n) System.out.print("Yes");
        else System.out.print("No");
    }
}
