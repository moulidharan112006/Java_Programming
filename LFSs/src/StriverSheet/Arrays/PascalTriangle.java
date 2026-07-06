package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) temp.add(1);
                else temp.add(lst.get(i-1).get(j-1) + lst.get(i-1).get(j));
            }
            lst.add(temp);
        }
        return lst;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        int len = n-1;
        for(List<Integer> l : ans){
            for(int i=0;i<len;i++){
                System.out.print(" ");
            }
            for(int j : l){
                System.out.print(j+" ");
            }
            len--;
            System.out.println();
        }
    }
}
