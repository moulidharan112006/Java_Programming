package StriverSheet.BinarySearch;

public class SearchIndex {
    static int searchIndex(int[] arr,int target){
        int low = 0,high = arr.length-1,ind = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                ind = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 2;
        System.out.println(searchIndex(arr,target));
    }
}
