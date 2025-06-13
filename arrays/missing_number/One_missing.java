/*Using Hashing - O(n) Time and O(n) Space
This approach uses a hash array (or frequency array) to track the presence of each number from 1 to n in the 
input array. It first initializes a hash array to store the frequency of each element. Then, it iterates 
through the hash array to find the number that is missing (i.e., the one with a frequency of 0).
 */

package arrays.missing_number;
public class One_missing {
    
    public static int missing(int[] arr){
        //System.out.println(arr.length);
        int[] hasharray =  new int[arr.length+2];

        for(int i=0;i<arr.length; i++){
            hasharray[arr[i]]++;
        }

        for(int i=0;i<arr.length; i++){
            System.out.print(hasharray[i]+" ");
        }

        for(int i=1;i<hasharray.length;i++){
            if(hasharray[i]==0){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,5,6,7,8};
        int num = missing(arr);
        if(num==-1){
            System.out.println("No missing number found");
        }
        else{
            System.out.println("Missing number is: "+num);
        }
        
    }
}
