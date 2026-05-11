import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateDigitInArray {
    static int[] separateDigit(int[] nums){
        List<Integer> lst = new ArrayList<>();
        for(int n : nums){
            List<Integer> temp = new ArrayList<>();
            while(n > 0){
                temp.add(n%10);
                n/=10;
            }
            Collections.reverse(temp);
            lst.addAll(temp);
        }
        int[] arr = new int[lst.size()];
        int ind =0;
        for(int n : lst){
            arr[ind++] = n;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {13,25,83,77};
        int[] res = separateDigit(arr);
        for(int n : res) System.out.print(n+" ");
    }
}
