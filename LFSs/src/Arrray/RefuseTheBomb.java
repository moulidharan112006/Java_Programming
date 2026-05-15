package Arrray;

public class RefuseTheBomb {
    static int[] refuseBomb(int[] arr,int k){
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(k > 0){
                for(int j=i+1;j<i+1+k;j++){
                    res[i]+=arr[j%n];
                }
            }
            else {
                for (int j = i - 1; j > i - 1 - Math.abs(k); j++) {
                    res[i] += arr[((j % n) + n) % n];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,1,4};
        int k = 3;
        int[] res = refuseBomb(arr,k);
        for(int i : res) System.out.print(i+" ");
    }
}
