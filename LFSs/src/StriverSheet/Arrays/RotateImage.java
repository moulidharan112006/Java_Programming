package StriverSheet.Arrays;

import java.util.Arrays;

public class RotateImage {

    //brute
    static int[][] rotateImage(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temp[j][arr.length-i-1] = arr[i][j];
            }
        }
        return temp;
    }

    //optimal
    static void rotateImageOptimal(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            int left = 0,right = arr.length-1;
            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[right][i];
                arr[right][i] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = rotateImage(arr);
        for(int[] row : res){
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        int[][] arr1 = {{5, 4, 2, 0}, {6, 5, 0, 1}, {7, 0, 3, 1}, {0, 5, 1, 2}};
        int[][] res2 = rotateImage(arr1);
        for(int[] row : res2){
            System.out.println(Arrays.toString(row));
        }
    }
}
