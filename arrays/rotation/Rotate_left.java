/*Using Reversal Algorithm - O(n) Time and O(1) Space
The idea is based on the observation that if we left rotate the array by d positions, the last (n - d) elements will be at the front and the first d elements will be at the end. 

Reverse the subarray containing the first d elements of the array.
Reverse the subarray containing the last (n - d) elements of the array.
Finally, reverse all the elements of the array. */

import java.util.Scanner;
public class Rotate_left {

    public static int[] reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6};

        System.out.println("Enter d value: ");
        int d = sc.nextInt();

        // handling d > size of array
        d = d % arr.length;

        //rotating "d" elements

        arr = reverse(arr, 0, d-1);

        arr = reverse(arr, d, arr.length-1);

        arr = reverse(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

        System.gc();
    }
    
}