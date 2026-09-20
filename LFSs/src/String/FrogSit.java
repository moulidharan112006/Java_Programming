package String;

import java.util.Scanner;

public class FrogSit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "|**|*|";
        int n = s.length();
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i];
            if (s.charAt(i) == '*') {
                pre[i + 1]++;
            }
        }
        int q = sc.nextInt();
        int[] startInd = new int[q];
        for (int i = 0; i < q; i++) {
            startInd[i] = sc.nextInt();
        }
        int[] endInd = new int[q];
        for (int i = 0; i < q; i++) {
            endInd[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int start = startInd[i] - 1;
            int end = endInd[i] - 1;
            while (start <= end && s.charAt(start) != '|') {
                start++;
            }
            while (start <= end && s.charAt(end) != '|') {
                end--;
            }
            if (start >= end) {
                System.out.println(0);
            } else {
                int answer = pre[end] - pre[start + 1];
                System.out.println(answer);
            }
        }
    }
}