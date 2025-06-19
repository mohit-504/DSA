package arrays.duplicates;

import java.util.Arrays;

public class Move_duplicates_return_distinct {
    public static int[] removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                i++;
                j++;  
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,1,1,2,2,3,3,3,4,4};
        System.out.println("After moving distinct elements together, array is: "+Arrays.toString(removeDuplicates(nums)));
    }
}
