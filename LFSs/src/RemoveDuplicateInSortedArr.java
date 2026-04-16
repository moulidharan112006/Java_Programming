import java.util.HashSet;

public class RemoveDuplicateInSortedArr {
    static int[] Bremove(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]) arr[j] = 0;
            }
        }
        return arr;
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
        remove(arr);
        int[] newArr = Bremove(arr);
        System.out.println();
        for(int n : newArr)
            if(n!=0)System.out.print(n+" ");
    }
}
