package String;

import java.util.Arrays;
public class DemonQuestion {
    public static void main(String[] args) {
        int n = 6;
        String s = "093212";
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += s.charAt(i) - '0';
        }
        int answer = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int ste = 0;
        for (int i = n - 1; i >= 0; i--) {
            ste += arr[i];
            int de = total - ste;
            if (ste > de) {
                answer = ste;
                break;
            }
        }
        System.out.println(answer);
    }
}
