package StriverSheet.Sorting;
import java.util.Arrays;

public class Bubble {
    static int[] bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
}
