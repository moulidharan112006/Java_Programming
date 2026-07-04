package StriverSheet.Arrays;

import java.util.Arrays;

public class SetMatrixZero {

    //brute
    static void setMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = -1;
                    cols[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] == -1 || cols[j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    //optimal
    static void setMatrixOptimal(int[][] arr){
        int n = arr.length,m=arr[0].length;
        boolean firstRow = false,firstCol = false;
        for(int j=0;j<m;j++){
            if(arr[0][j] ==0){
                firstRow = true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i][0] ==0){
                firstCol = true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] =0;
                }
            }
        }
        if(firstRow){
            for(int j=0;j<m;j++){
                arr[0][j] = 0;
            }
        }
        if(firstCol){
            for(int i=0;i<n;i++){
                arr[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrix(arr);
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        int[][] arr2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixOptimal(arr2);
        for(int[] row : arr2){
            System.out.println(Arrays.toString(row));
        }
    }
}
