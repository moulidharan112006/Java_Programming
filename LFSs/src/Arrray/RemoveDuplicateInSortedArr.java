package Arrray;

import java.util.HashSet;

public class RemoveDuplicateInSortedArr {
    static int[] bRemove(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]) arr[j] = 0;
            }
        }
        return arr;
    }
    static int oRemove(int[] arr){
        int ind =1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!= arr[i+1]){
                arr[ind++] = arr[i+1];
            }
        }
        return ind;
    }
    static void remove(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        for(int n : set) System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//        remove(arr);
//        int[] newArr = bRemove(arr);
//        System.out.println();
//        for(int n : newArr)
//            if(n!=0)System.out.print(n+" ");
        int len = oRemove(arr);
        for(int i=1;i<=len;i++){
            System.out.print(i+" ");
        }
    }
}
