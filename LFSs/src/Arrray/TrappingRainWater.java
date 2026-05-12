package Arrray;

public class TrappingRainWater {
    // brute force
    static int trappingRain(int[] height){
        int i = 0, waterCount = 0;
        while(i < height.length){
            boolean isFound = false;
            for(int j = i + 1; j < height.length; j++){
                if(height[j] >= height[i]){
                    int left = i + 1, right = j;
                    while(left < right){
                        waterCount += Math.min(height[i], height[j]) - height[left];
                        left++;
                    }
                    i = right;
                    isFound = true;
                    break;
                }
            }

            if(!isFound){
                int maxIndex = i + 1;
                for(int k = i + 1; k < height.length; k++){
                    if(height[k] > height[maxIndex]){
                        maxIndex = k;
                    }
                }
                int left = i + 1, right = maxIndex;
                while(left < right){
                    waterCount += Math.min(height[i], height[maxIndex]) - height[left];
                    left++;
                }
                i = maxIndex;
            }
        }
        return waterCount;
    }

    // better
    static int bTrap(int[] height){
        int left =0,right = height.length -1,leftMax=0,rightMax = 0,waterCount =0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }
                else{
                    waterCount+=leftMax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    waterCount += rightMax - height[right];
                }
                right--;
            }
        }
        return waterCount;
    }
    public static void main(String[] args) {
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] arr = {4,2,0,3,2,5};
        int[] arr = {5,4,1,2};
        System.out.println(trappingRain(arr));
        System.out.println(bTrap(arr));
    }
}
