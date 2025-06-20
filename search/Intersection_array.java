package search;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

import java.util.HashSet;
import java.util.Set;


public class Intersection_array {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<Integer>();
        Set<Integer> hset = new HashSet<Integer>();
        for(int num:nums1){
            hset.add(num);
        }
        for(int num:nums2){
            if(hset.contains(num)){
                res.add(num);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int num : res) {
            result[i++] = num;
        }
        return result;
    }
}
