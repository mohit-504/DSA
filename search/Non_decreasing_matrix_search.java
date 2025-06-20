package search;

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity. 

Input: matrix = 
[[1,3,5,7],
 [10,11,16,20],
 [23,30,34,60]], 
target = 3
Output: true

Input: matrix = 
[[1,3,5,7],
 [10,11,16,20],
 [2 3,30,34,60]], 
target = 13
Output: false
*/

/*
HOW:
check all elements at column 0 of all rows. the elements between which target lies, search only that row.
*/
public class Non_decreasing_matrix_search {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0]) {
                row = i;
            } else {
                break; 
            }
        }
        if (row == -1) return false;  
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] == target) {
                return true;
            }
        }

        return false;
    }

}
