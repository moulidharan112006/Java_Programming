package Trainning;

public class RemoveDuplicateEasy {
    static int removeDuplicate(int[] arr){
        int ind = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[ind] != arr[i]){
                ind++;
                arr[ind] = arr[i];
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4};
        int n = removeDuplicate(arr);
        for(int i=0;i<=n;i++) System.out.print(arr[i]+" ");
    }
}
