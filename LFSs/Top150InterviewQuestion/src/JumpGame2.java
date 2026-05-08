public class JumpGame2 {
    static int minimumJump(int[] arr){
        int l = 0,r=0,count =0;
        while (r < arr.length-1){
            int far = 0;
            for(int i=l;i<=r;i++){
                far = Math.max(far,i+arr[i]);
            }
            l = r+1;
            r = far;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,0,1,4};
        System.out.println(minimumJump(arr));
    }
}
