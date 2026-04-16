public class EquilibriumIndex {
    static int findIndex(int[] arr){
        int totalSum = 0;
        for(int i : arr){
            totalSum+=i;
        }

        int left = 0;
        for(int i=0;i< arr.length;i++){
            int right = totalSum - left - arr[i];
            if(right == left) return i;
            left+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findIndex(arr));
    }
}
