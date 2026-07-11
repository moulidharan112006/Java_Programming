package StriverSheet.BinarySearch;

public class UpperBound {

    //brute
    static int upperBound(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > target){
                return  i;
            }
        }
        return arr.length;
    }

    //optimal
    static int upperBoundOptimal(int[] arr,int target){
        int low = 0,high = arr.length-1,ind = arr.length;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                ind = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int target = 9;
        System.out.println(upperBound(arr,target));
        System.out.println(upperBoundOptimal(arr,target));
    }
}
