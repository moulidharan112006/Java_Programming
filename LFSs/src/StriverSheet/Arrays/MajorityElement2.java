package StriverSheet.Arrays;

import java.util.*;

public class MajorityElement2 {
    //better
    static List<Integer> majorityElement2(int[] arr){
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int mini = arr.length/3 + 1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= mini) lst.add(e.getKey());
        }
        return lst;
    }

    //optimal
    static List<Integer> majorityElement(int[] arr){
        int count1 = 0,count2 = 0,element1 = Integer.MIN_VALUE,element2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(count1 == 0 && element2 != arr[i]){
                count1 = 1;
                element1 = arr[i];
            }
            else if(count2 == 0 && element1 != arr[i]){
                count2 = 1;
                element2 = arr[i];
            }
            else if(arr[i] == element1) count1++;
            else if(arr[i] == element2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1 =0;
        count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element1) count1++;
            else if(arr[i] == element2) count2++;
        }

        int mini = arr.length/3 +1;
        List<Integer> lst = new ArrayList<>();
        if(count1 >= mini) lst.add(element1);
        if(count2 >= mini && element1 != element2) lst.add(element2);

        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3,2};
        System.out.println(majorityElement2(arr));
        System.out.println(majorityElement(arr));
    }
}
