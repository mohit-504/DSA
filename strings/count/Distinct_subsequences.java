package strings.count;
/*Given a string str of length n, your task is to find the count of distinct subsequences of it.

Examples: 

Input: str = "gfg"
Output: 7
Explanation: The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" 

Input: str = "ggg"
Output: 4
Explanation: The four distinct subsequences are "", "g", "gg" and "ggg" */

import java.util.Arrays;

public class Distinct_subsequences {

    public static int count(String s){

        int [] dp = new int[s.length()+1];
        dp[0]=1;

        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=1;i<=s.length();i++){
            //distinct subsequences considering a new character is always double the no of distinct 
            //subsequences conisdering old characters
            dp[i] = dp[i-1]*2;

            int charIndex = s.charAt(i-1) - 'a'; //eg: g=6, f=7 

            //if character has appeared before, then we decrease the amount of distinct substrings it can make
            if(last[charIndex] != -1){
                dp[i] -= dp[last[charIndex]];
            }

            //character has now appeared so we update the index at which it appeared in the last array
            last[charIndex] = i-1;
        }

        for(int i:dp){
            System.out.print(i+" ");
        }
        System.out.println();

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String str = "gfgfxg";
        int result=count(str);
        System.out.println("No of distinct substrings is "+result);
    }
}
