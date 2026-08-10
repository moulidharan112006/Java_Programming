package StriverSheet.Arrays;

public class CountInversion {
    //brute force
    static int countInversion(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]) count++;
            }
        }
        return count++;
    }
    //optimal
    static int countInversionOptimal(int[] arr){
        return mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int[] arr,int left,int right){
        int count = 0;
        if(left >= right) return count;
        int mid = (right + left)/2;
        count+=mergeSort(arr,left,mid);
        count+=mergeSort(arr,mid+1,right);
        count+=merge(arr,left,mid,right);
        return count;
    }
    static int merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int count =0,left = low,right = mid+1,k=0;
        while (left <=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
                count+=(mid-left+1);
            }
        }
        while (left <= mid){
            temp[k++] = arr[left++];
        }
        while (right <= high){
            temp[k++] = arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i - low];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,3,7,1};
        System.out.println(countInversion(arr));
        System.out.println(countInversionOptimal(arr));
    }
}
