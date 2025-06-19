package search;
/* 
You are standing at position 0 on an infinite number line. There is a destination at position target.

You can make some number of moves numMoves so that:

On each move, you can either go left or right.
During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to 
reach the destination.
 */

 /* 
HOW:
use binary search to reach sum >= target. if its equal then return simply return n value.
if not then keep incrementing until sum - target is an even number 
(as an even number can be changed to target by modifying addition to subtraction of nos in the sequence)
eg1: target = 5
1+2+3 = 6, 6-5 = 1 -> odd
1+2+3+4 = 1=, 10-5 = 5 -> odd
1+2+3+4+5 = 15, 15-5 = 10 -> even
sequence: 1-2-3+4+5

eg2: target = 13
1+2+3+4+5 = 15, 15-13 = 2 -> even
sequence: -1+2+3+4+5
 */
public class Reach_a_number {
    public static int reachNumber(int target) {
        if(target==0){
            return 0;
        }
        target=Math.abs(target);
        int start = 0, end = target; 
        while (start < end) {
            int mid = start + (end - start) / 2;
            long sum = ((long) mid * (mid + 1)) / 2; 
            if (sum < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int n = end;
        long sum = ((long) n * (n + 1)) / 2;
        while(((sum - target) % 2) != 0){
            n++;
            sum += n; 
        }
        return n;
    }

    public static void main(String[] args) {
        int target = 13;
        System.out.println("Moves to reach "+target+" = "+reachNumber(target));
    }
}

