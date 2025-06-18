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


public class Words_in_string {

    public static int countWords(String words[], String str){
        int count=0;
        for(int i=0;i<words.length;i++){
            if(str.contains(words[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String words[] = {"welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks.";

        int count = countWords(words, str);
        System.out.println("Words matching in string: "+count);
    }
}
