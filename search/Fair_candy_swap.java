package search;
/* 
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

 

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
*/

/* 
HOW:
First, store all of Alice's candy box sizes in a HashSet and compute the total sum of her candies.
Then, subtract the total of Bob's candies from Alice's total to get the difference, and divide it by 2.
This difference represents the amount by which one person has more than the other.
For each candy box size in Bob's list, check if Alice has a box with size equal to b + diff.
If such a box exists, return the pair as the valid swap that equalizes both totals.
*/
import java.util.HashSet;
import java.util.Set;

public class Fair_candy_swap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum=0;
        Set<Integer> hs = new HashSet<Integer>();
        for(int a:aliceSizes){
            hs.add(a);
            aliceSum += a;
        }
        int diff=aliceSum;
        for(int b:bobSizes){
            diff -= b;
        }
        diff = diff/2;
        for(int b:bobSizes){
            if(hs.contains(b+diff)){
                return new int[] {b+diff, b};
            }
        }
        return new int[] {0,0};

    }
}
