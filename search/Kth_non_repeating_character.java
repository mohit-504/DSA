package search;
/*Given a string str of length n (1 <= n <= 106) and a number k, the task is to find the kth 
non-repeating character in the string.

Examples: 

Input : str = geeksforgeeks, k = 3
Output : r
Explanation: First non-repeating character is f, second is o and third is r.

Input : str = geeksforgeeks, k = 2
Output : o

Input : str = geeksforgeeks, k = 4
Output : Less than k non-repeating characters in input. */

import java.util.HashMap;
import java.util.Map;

/*How:
    1) Create an empty hash map to store character counts.
    2) Loop through the string and update the counts of each character in the hash map.
    3) Loop through the string again and find the kth non-repeating character by checking the count of each 
    character in the hash map.
 */

public class Kth_non_repeating_character {

    public static char searchKthNonRepeatingChar(String s, int k){
        
        Map <Character, Integer> counts = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
        }

        int nonRepeatingCount = 0;
        for(int i=0;i<s.length();i++){
            if(counts.get(s.charAt(i)) == 1){
                nonRepeatingCount++;
                
                if(nonRepeatingCount == k){
                    return s.charAt(i);
                }
            }
        }

        return '_';
    }
    public static void main(String[] args) {
        String str="mnnnoosssprooosppp";
        int k=3;

        char result = searchKthNonRepeatingChar(str,k);
        if(result == '_'){
            System.out.println("No kth non-repeating character in the string.");
        }
        else{
            System.out.println("Kth non-repeating character in the string is "+result);
        }
    }
}
