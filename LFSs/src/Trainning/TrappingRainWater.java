package Trainning;

public class TrappingRainWater {
    static int trappingRainWater(int[] arr){
        int left =0,right = arr.length-1,leftMax = 0,rightMax = 0,water =0;
        while(left < right){
            if(arr[left] < arr[right]){
                if(arr[left] >= leftMax){
                    leftMax = arr[left];
                }
                else{
                    water+= leftMax - arr[left];
                }
                left++;
            }
            else{
                if(arr[right] >= rightMax){
                    rightMax = arr[right];
                }
                else{
                    water+=rightMax - arr[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int[] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(arr));
    }
}
