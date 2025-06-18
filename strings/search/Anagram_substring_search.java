package strings.search;
/*
Given a text txt and a pattern pat of size n and m respectively, the task is to find all occurrences of pat and its permutations (or anagrams) in txt. You may assume n > m.

Examples: 

Input: txt = "BACDGABCDA",  pat = "ABCD"
Output: [0, 5, 6]
Explanation: "BACD" is at 0, "ABCD" at 5 and "BCDA" at 6

Input: txt = "AAABABAA", pat = "AABA"   
Output:  [0, 1, 4]
Explanation: "AAAB" is at 0, "AABA" at 5 and "ABAA" at 6
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


/*
How:
The idea is to use two count arrays: 

The first count array (say, countP) store frequencies of characters in pattern. 
The second count array (say, countTW) stores frequencies of characters in current window of text. 
And we can get the count for next window by reducing frequency of last character of current window and 
increasing frequency of next character.
*/

public class Anagram_substring_search {

    public static List<Integer> search(String p, String s){
        List<Integer> result = new ArrayList<>();
        int[] countP = new int[256];
        int[] countTW = new int[256];

        Arrays.fill(countP,0);
        Arrays.fill(countP,0);

        //initializing countP and the first sliding window countTW
        for(int i=0;i<p.length();i++){
            countP[p.charAt(i)]++;
            countTW[s.charAt(i)]++;
        }

        for(int i=p.length();i<s.length();i++){
            //sliding window compared with pattern hash array
            if(Arrays.equals(countP, countTW)){
                result.add(i-p.length());
            }

            // moving the sliding window by
            // 1. reducing the count of the outgoing character
            // 2. increment count of incoming character
            countTW[s.charAt(i - p.length())]--;
            countTW[s.charAt(i)]++; 
        }

        //checking at last window
        if(Arrays.equals(countP, countTW)){
            result.add(s.length()-p.length());
        }

        return result;
    }
    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        List<Integer> res = search(pat, txt);

        if(res.isEmpty()){
            System.out.println("Pattern or its anagrams not found in text");
        }
        else{
            System.out.println("Pattern or its anagrams found at indices: ");
            for (int i : res) {
                System.out.print(i + " ");
            }
        }
    }
}
