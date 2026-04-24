import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0,right = matrix[0].length -1 ,top = 0,bottom = matrix.length-1;
        while(left <= right && top <= bottom){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                res.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
                for(int k=right;k>=left;k--){
                    res.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left <= right){
                for(int l=bottom;l>=top;l--){
                    res.add(matrix[l][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> l = spiralOrder(arr);
        System.out.println(l);
    }
}
