package Trainning;

public class ContainerWithMostWater {
    static int containerwithMostWater(int[] arr){
        int max = 0,left =0,right = arr.length-1;
        while (left < right){
            max = Math.max(max,(right - left) * Math.min(arr[left],arr[right]));
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerwithMostWater(arr));
    }
}
