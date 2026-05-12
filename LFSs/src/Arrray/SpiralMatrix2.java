package Arrray;

public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int val = 1;

        while (left <= right && top <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = val;
                val++;
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                arr[j][right] = val;
                val++;
            }
            right--;

            if (top <= right) {
                for (int k = right; k >= left; k--) {
                    arr[bottom][k] = val;
                    val++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    arr[l][left] = val;
                    val++;
                }
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] l = generateMatrix(n);
        for(int i=0;i<l.length;i++){
            for(int j=0;j<l[0].length;j++){
                System.out.print(l[i][j]+" ");
            }
            System.out.println();
        }
    }
}
