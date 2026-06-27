package StriverSheet.Arrays;

public class RemoveDuplicate {
    static int removeDuplicate(int[] arr){
        if(arr.length == 0) return 0;
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int ind = removeDuplicate(arr);
        for(int i =1;i<=ind;i++) System.out.print(i+" ");
    }
}
