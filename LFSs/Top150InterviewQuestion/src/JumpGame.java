public class JumpGame {
    static boolean jumpGame(int[] arr){
        int ind =0;
        for(int i=0;i< arr.length;i++){
            if(i > ind) return false;
            ind = Math.max(ind,i+arr[i]);
            if(ind >= arr.length-1);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(jumpGame(arr));
    }
}
