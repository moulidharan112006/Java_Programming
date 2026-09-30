package String;
public class ContinuousSubarray {
    static boolean isSubarray(int[] arr1, int[] arr2) {
        if (arr2.length == 0) {
            return true;
        }
        if (arr2.length > arr1.length) {
            return false;
        }
        int[] lps = new int[arr2.length];
        int len = 0;
        int i = 1;
        while (i < arr2.length) {
            if (arr2[i] == arr2[len]) {
                len++;
                lps[i] = len;
                i++;
            }
            else if (len != 0) {
                len = lps[len - 1];
            }
            else {
                lps[i] = 0;
                i++;
            }
        }
        i = 0;
        int j = 0;
        while (i < arr1.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
                if (j == arr2.length) {
                    return true;
                }
            }
            else if (j != 0) {
                j = lps[j - 1];
            }
            else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 2, 7, 9, 2, 7, 9, 4};
        int[] arr2 = {2, 7, 9};
        System.out.println(isSubarray(arr1, arr2));
    }
}
