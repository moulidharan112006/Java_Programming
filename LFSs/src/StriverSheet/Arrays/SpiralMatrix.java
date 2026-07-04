package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralMatrix(int[][] arr){
        int top = 0,bottom = arr.length-1,left =0,right=arr[0].length-1;
        List<Integer> lst = new ArrayList<>();

        while (left <= right && top <= bottom){
            for(int i=left;i<=right;i++){
                lst.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                lst.add(arr[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    lst.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    lst.add(arr[i][left]);
                }
                left++;
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
        List<Integer> ans = spiralMatrix(arr);
        for(int i : ans) System.out.print(i+" ");
    }
}
