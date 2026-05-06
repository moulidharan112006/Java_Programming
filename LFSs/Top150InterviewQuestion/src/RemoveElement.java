public class RemoveElement {
    static int removeElement(int[] arr,int value){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != value){
                arr[j++] = arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int value = 3;
        System.out.println(removeElement(arr,value));
    }
}
