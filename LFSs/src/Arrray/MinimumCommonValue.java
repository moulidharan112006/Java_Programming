package Arrray;

public class MinimumCommonValue {
    static int commonValue(int[] nums1,int[] nums2){
        int left =0,right =0,min = Integer.MAX_VALUE;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] == nums2[right]){
                min = Math.min(min,nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left] > nums2[right]) right++;
            else if(nums1[left] < nums2[right]) left++;
        }
        return (min != Integer.MAX_VALUE)?min:-1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5};
        int[] arr2 = {2,4};
        System.out.println(commonValue(arr1,arr2));
    }
}
