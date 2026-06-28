package StriverSheet.Arrays;

import java.util.*;

public class UnionOfTwoArray {
    //Approach -1 -> using HashMap
    static int[] unionOfArray(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n : arr2){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            lst.add(e.getKey());
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }

    //Approach - 2 -> using HashSet
    static int[] unionArray(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr1){
            set.add(n);
        }
        for(int n : arr2){
            set.add(n);
        }
        int[] arr = new int[set.size()];
        int ind = 0;
        for(int n : set){
            arr[ind++] = n;
        }
        return arr;
    }

    //Approach - 3 -> using TwoPointer
    static int[] arrayUnion(int[] arr1,int[] arr2){
        List<Integer> lst = new ArrayList<>();
        int i=0,j=0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(lst.isEmpty() || lst.getLast() != arr1[i]) lst.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(lst.isEmpty() || lst.getLast() != arr2[j]) lst.add(arr2[j]);
                j++;
            }
            else{
                if(lst.isEmpty() || lst.getLast() != arr1[i]) lst.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
                if (lst.isEmpty() || lst.getLast() != arr1[i]) lst.add(arr1[i]);
                i++;
        }
        while (j < arr2.length) {
            if (lst.isEmpty() || lst.getLast() != arr2[j]) lst.add(arr2[j]);
            j++;
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,5,6,7};
        System.out.println(Arrays.toString(unionOfArray(arr1,arr2)));
        System.out.println(Arrays.toString(unionArray(arr1,arr2)));
        System.out.println(Arrays.toString(arrayUnion(arr1,arr2)));
    }
}
