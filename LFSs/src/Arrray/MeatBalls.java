package Arrray;

import java.util.Arrays;

public class MeatBalls {

    static int minPlates(int n, int m, int[] arr) {
        Arrays.sort(arr);

        int sum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            count++;

            if (sum >= m)
                return count;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 6, m = 18;
        int[] arr = {2, 9, 5, 6,8,4};

        System.out.println(minPlates(n, m, arr));
    }
}
