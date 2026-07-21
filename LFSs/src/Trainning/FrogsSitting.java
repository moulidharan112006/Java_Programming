package Trainning;

import java.util.Arrays;

public class FrogsSitting {
    static int NumberOfFrogs(String s){
        int left = 0,right = s.length()-1,count=0;
        while(s.charAt(left) != '|') left++;
        while(s.charAt(right)!='|') right--;
        for(int i=left;i<right;i++){
            if(s.charAt(i) == '*') count++;
        }
        return count;
    }
    static int[] frogsSitting(String s,int[] start,int[] end){
        int[] res = new int[start.length];
        for(int i=0;i<start.length;i++){
            res[i] = NumberOfFrogs(s.substring(start[i]-1,end[i]));
        }
        return  res;
    }
    public static void main(String[] args) {
        String s = "|**|*|";
        int[] start = {1,1};
        int[] end = {5,6};
        System.out.println(Arrays.toString(frogsSitting(s,start,end)));
    }
}
