public class MoveAtEnd {
    // Better
    static void Bswap(int[] arr){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length){
            arr[count++] = 0;
        }
    }

    // Optimal
    static void oSwap(int[] arr){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//        Bswap(arr); //Better
        oSwap(arr);
        for(int i=0;i< arr.length;i++) System.out.print(arr[i]+" ");
    }
}