package Arrray;

public class SetMatrixZeroes {
    static void setMatrixValue(int[][] arr,int r,int c){
        for(int i=0;i<arr.length;i++){
            if(arr[i][c] != 0){
                arr[i][c] = -10;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            if(arr[r][i] != 0){
                arr[r][i] = -10;
            }
        }
    }
    static void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    setMatrixValue(matrix,i,j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == -10){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
