package search;
/* 
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
*/


import java.util.HashSet;
import java.util.Set;

public class N_and_its_double {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hset = new HashSet<Integer>();
        for (int i : arr) {
            if (hset.contains(i * 2) || (i % 2 == 0 && hset.contains(i / 2))) {
                return true;
            }
            hset.add(i);
        }

        return false;
    }
}
