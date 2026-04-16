import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighestNumber {
    // better

    static int bSecondLarge(int[] arr){
        Arrays.sort(arr);
        for(int i= arr.length - 1;i>0;i--){
            if(arr[i] != arr[i-1]) return arr[i-1];
        }
        return -1;
    }
    // optimal
    static int secondLarge(int[] arr){
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < first && arr[i] > second){
                second = arr[i];
            }
        }
        return (second == Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr = {10,10,10};
        System.out.println(secondLarge(arr));
        System.out.println(bSecondLarge(arr));
    }
}
