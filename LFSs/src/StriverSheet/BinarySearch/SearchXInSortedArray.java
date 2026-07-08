package StriverSheet.BinarySearch;

public class SearchXInSortedArray {

    //Iterative method
    static int searchX(int[] arr,int k){
        int left =0,right = arr.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == k) return mid;
            else if(arr[mid] < k) left = mid+1;
            else if(arr[mid] > k) right = mid-1;
        }
        return -1;
    }

    //Recursive Method
    static int searchXRecursion(int[] arr,int left,int right,int k){
        int mid = (left+right)/2;
        if(arr[mid] == k) return mid;
        else if(arr[mid] > k) return searchXRecursion(arr,left,mid-1,k);
        return searchXRecursion(arr,mid+1,right,k);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        System.out.println(searchX(arr,target));
        System.out.println(searchXRecursion(arr,0,arr.length-1,target));
    }
}
