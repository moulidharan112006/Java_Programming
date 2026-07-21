package Trainning;

import java.util.HashSet;

public class MailTODelete {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 3, 3, 4, 3, 3 };
        HashSet<Integer> set = new HashSet<>();
        int deleted = 0;

        for (int x: arr){
            if (set.contains(x)) {
                deleted++;
            } else {
                set.add(x);
            }
        }

        System.out.println(deleted);
    }
}
