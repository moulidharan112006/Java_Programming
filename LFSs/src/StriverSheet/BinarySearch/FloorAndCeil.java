package StriverSheet.BinarySearch;

public class FloorAndCeil {
    static int floor(int[] arr,int target){
        int low = 0,high = arr.length,ind = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= target){
                ind = arr[mid];
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ind;
    }
    static int ceil(int[] arr,int target){
        int low = 0,high = arr.length,ind = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                ind = arr[mid];
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;
        System.out.println(floor(arr,target)+" "+ceil(arr,target));
    }
}
