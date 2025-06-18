package strings.count;

/*Given an array of words and a string, we need to count all words that are present in given string. 

Examples:

Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.


Input : words[] = {"Save", "Water", "Save", "Yourself"}
        str     = "Save"
Output :1 */
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words_in_string_hashmap {
    
    public static int countWords(String[] w, String s){
        int count=0;

        Pattern p = Pattern.compile("[a-zA-Z]+"); //pattern of letters a-z or A-Z repeating. no special characters
        Matcher m = p.matcher(s); //matcher that finds subsequences in the string that match the pattern

        HashSet <String> hs = new HashSet<String>();

        for(String i:w){
            hs.add(i);
        }

        //m.find() returns true for every subsequence the matcher finds
        //m.group returns the actual subsequence that m.find() returned true for 
        //check if subsequence is present in the HashSet
        while(m.find()){ 
            if(hs.contains(m.group())){ 
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String words[] = {"welcome", "to", "geeks", "portal", "science"};
        String str = "geeksforgeeks is a computer science portal for geeks.";

        int count = countWords(words, str);
        System.out.println("Words matching in string: "+count);
    }

}
