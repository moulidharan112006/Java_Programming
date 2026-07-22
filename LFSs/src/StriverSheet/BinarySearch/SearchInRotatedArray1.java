package StriverSheet.BinarySearch;

public class SearchInRotatedArray1 {
    static int searchIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }

    //optimal
    static int searchIndexOptimal(int[] arr,int target){
        int low = 0, high = arr.length -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low]<=target && arr[mid] < target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 0;
        System.out.println(searchIndex(arr,target));
    }
}
