package Trainning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInOrder {
    static List<String> sortInOrder(String s){
        List<String> lst = new ArrayList<>();
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                lst.add(s.substring(i,j));
            }
        }
        Collections.sort(lst);
        return lst;
    }
    public static void main(String[] args) {
        String s = "abdc";
        List<String> res = sortInOrder(s);
        System.out.println(res);
    }
}
