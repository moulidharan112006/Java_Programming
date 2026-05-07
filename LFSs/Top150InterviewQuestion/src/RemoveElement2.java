public class RemoveElement2 {
    static int removeElement(int[] arr){
        int prev = arr[0],j=1,ans= 1,freq=1;
        for(int i=0;i< arr.length;i++){
            if(prev == arr[i]) freq++;
            else freq = 1;
            if(freq <= 2){
                arr[j] = arr[i];
                j++;
                ans++;
            }
            prev = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        for(int i=0;i<removeElement(arr);i++) System.out.print(arr[i] +" ");
    }
}
