public class ContainerWithMoreWater {
    static int moreWater(int[] arr){
        int maxWater =0,left =0,right = arr.length-1;
        while(left < right){
            maxWater = Math.max(maxWater,(right - left) * Math.min(arr[left],arr[right]));
            if(arr[left] < arr[right] ) left++;
            else right--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(moreWater(arr));
    }
}
