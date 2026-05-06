public class RemoveDuplicateInSortedArray {
    static int removeDuplicate(int[] arr){
        int j =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[j]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        for(int i=1;i<=removeDuplicate(arr);i++){
            System.out.print(i+" ");
        }
    }
}
