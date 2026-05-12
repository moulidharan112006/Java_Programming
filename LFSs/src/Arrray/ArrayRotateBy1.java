package Arrray;

public class ArrayRotateBy1 {
    //Optimal
    static void rotate(int[] arr,int l,int r){
        while(l < r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l =0,r = arr.length-1,k=1;
        k=k% args.length;
        rotate(arr,l,r);
        rotate(arr,l,k-1);
        rotate(arr,k,r);
        for (int n : arr) System.out.print(n+" ");
    }
}
