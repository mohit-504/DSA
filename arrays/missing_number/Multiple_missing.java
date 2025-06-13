/*Using Hashing - O(n) Time and O(n) Space
This approach uses a hash array (or frequency array) to track the presence of each number from 1 to n in the 
input array. It first initializes a hash array to store the frequency of each element. Then, it iterates 
through the hash array to find the number that is missing (i.e., the one with a frequency of 0).
 */

 package arrays.missing_number;
 import java.util.*;
 public class Multiple_missing {
     
    public static List<Integer> missing(int[] arr){
        List<Integer> missing_values = new ArrayList<>();
        Map<Integer, Integer> nummap = new HashMap<>();
        
        int max = arr[0];  // start by assuming first element is the max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // found a new max
            }
        }

        for(int i=1;i<=max;i++){
            nummap.put(i, 0);
        }

        for(int i=0;i<arr.length;i++){
            nummap.put(arr[i], nummap.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : nummap.entrySet()){
            if(entry.getValue()==0){
                missing_values.add(entry.getKey());
            }
        }

        if(missing_values.isEmpty()){
            missing_values.add(-1);
        }

        return missing_values;
         
    }
    public static void main(String args[]){
        int[] arr = {8,7,4,3,1};
        List<Integer> missing_values = missing(arr);
        if(missing_values.get(0)==-1){
            System.out.println("No missing number found");
        }
        else{
            System.out.println("Missing numbers are: ");
            for(int i:missing_values){
                System.out.print(i+" ");
            }
        }
         
    }
 }
 