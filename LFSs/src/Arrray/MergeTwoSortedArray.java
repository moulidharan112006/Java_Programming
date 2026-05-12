package Arrray;

public class MergeTwoSortedArray {

    //better
    static int[] merge(int[] arr1,int[] arr2){
        int[] mer = new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mer[k++] = arr1[i++];
            }
            else{
                mer[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) mer[k++] = arr1[i++];
        while (j < arr2.length) mer[k++] = arr2[j++];

        return mer;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] ans = merge(arr1,arr2);
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
