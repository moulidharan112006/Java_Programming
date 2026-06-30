package StriverSheet.Arrays;

import java.util.Arrays;

public class Sort012 {
    static int[] sortColor(int[] arr){
        int zero =0,one=0,two =0;
        for(int n : arr){
            if(n == 0) zero++;
            else if(n == 1) one++;
            else two ++;
        }
        System.out.println(zero+" "+one+" "+two);
        int ind =0;
        while(zero > 0){
            arr[ind++] = 0;
            zero--;
        }
        while(one > 0){
            arr[ind++] = 1;
            one--;
        }
        while(two > 0){
            arr[ind++] = 2;
            two--;
        }
        return arr;
    }

    static int[] colorSort(int[] arr){
        int low =0,mid =0,high =arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        System.out.println(Arrays.toString(sortColor(arr)));
        System.out.println(Arrays.toString(colorSort(arr)));
    }
}
