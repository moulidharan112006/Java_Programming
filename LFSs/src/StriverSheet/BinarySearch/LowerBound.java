package StriverSheet.BinarySearch;

public class LowerBound {

    //brute
    static int lowerBound(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= x){
                return i;
            }
        }
        return arr.length;
    }

    //optimal
    static int lowerBoundOptimal(int[] arr,int x){
        int low = 0, high = arr.length - 1,ans = arr.length;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBound(arr,x));
        System.out.println(lowerBoundOptimal(arr,x));
    }
}
