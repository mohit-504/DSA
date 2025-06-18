package strings.search;
/*Given a string s of lowercase English letters, the task is to find the first non-repeating character. 
If there is no such character, return '$'.

Examples: 

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: 'f' is the first character in the string which does not repeat.

Input: s = "racecar"
Output: 'e'
Explanation: 'e' is the only character in the string which does not repeat.

Input: "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating. */

import java.util.HashMap;
import java.util.Map;

public class First_non_repeating_character {

    public static char firstNonRepeatingChar(String s){
        Map<Character,Integer> counts = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0;i<s.length();i++){
            if(counts.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return '$';
    }
    public static void main(String[] args) {
        String s = "DDDSAAA";
        char c = firstNonRepeatingChar(s);
        if(c == '$'){
            System.out.println("All characters in string are repeating");
        }
        else{
            System.out.println("First non-repeating character is "+c);
        }
    }
}
