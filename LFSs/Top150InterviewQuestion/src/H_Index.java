import java.util.Arrays;

public class H_Index {
    static int index(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i] >= n - i) return n -i;
        }
        return  0;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        System.out.println(index(arr));
    }
}
