package StriverSheet.BinarySearch;

public class CountOccurrence {
    static int occurrence(int[] arr,int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(x == arr[i]) count++;
        }
        return count;
    }

    //optimal
    static int occurrenceOptimal(int[] arr,int x){
        int low = 0, high = arr.length - 1, first = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] < x) low = mid+1;
            else if(arr[mid] > x) high = mid-1;
        }
        return first;
    }

    static int occurrenceLast(int[] arr,int x){
        int low = 0, high = arr.length - 1, last = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid] < x) low = mid+1;
            else if(arr[mid] > x) high = mid-1;
        }
        return last;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,2,3,3};
        int x = 2;
        System.out.println(occurrence(arr,x));
        System.out.println(occurrenceLast(arr,x) - occurrenceOptimal(arr,x) + 1);
    }
}
