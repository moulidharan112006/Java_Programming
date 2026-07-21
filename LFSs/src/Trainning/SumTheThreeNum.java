package Trainning;

public class SumTheThreeNum {
    public static void main(String[] args) {

        long i = 5;
        long j = 9;
        long k = 6;

        long sum = 0;

        for (long x = i; x <= j; x++) {
            sum += x;
        }

        for (long x = j - 1; x >= k; x--) {
            sum += x;
        }

        System.out.println(sum);
    }
}
