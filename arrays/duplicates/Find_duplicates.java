package arrays.duplicates;

import java.util.*;
public class Find_duplicates {
    public static List<Integer> find(int [] arr){
        int n = arr.length;
        Map<Integer,Integer> freqmap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            freqmap.put(arr[i], (freqmap.getOrDefault(arr[i], 0) + 1));
        }

        for(Map.Entry<Integer,Integer> entry : freqmap.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }

        if(duplicates.isEmpty()){
            duplicates.add(-1);
        }

        return duplicates;
    }

    public static void main(String[]args){
        // int [] arr = {1,2,3,4,3,1,4,6,7,3,1,4,5,6,4,3,7,8,9,1,4,5,3,2,6,7,8,8,7,6,5,3,4,2,1};
        // int [] arr = {1,1,1,2,2,3,4,5,5,6,6};
        int [] arr = {1,2,3,4};
        List<Integer> result = find(arr);
        if(result.get(0)==-1){
            System.out.println("NO DUPLICATES");
        }
        else{
            for(int i:result){
                System.out.println(i+" ");
            }
        }
        System.gc();
    }
}
