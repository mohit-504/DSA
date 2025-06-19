package search;
/*Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string.

Examples: 

Input : arr[] = {"for", "geeks", "", "", "", "", "ide", 
                      "practice", "", "", "", "quiz"}
          x = "geeks"
Output : 1

Input : arr[] = {"for", "geeks", "", "", "", "", "ide", 
                      "practice", "", "", "", "quiz"}, 
          x = "ds"
Output : -1 */

public class Sparse_search {

    public static int sparseSearch(String [] arr, int low, int high, String x){
        if(low>high){
            return -1;
        }

        int mid = (low+high)/2;
        System.out.println("low= "+low+" high= "+high+ " mid= "+mid);
        System.out.println(arr[mid]);


        if(arr[mid]==""){
            int left=mid-1;
            int right=mid+1;

            while(true)
            {   
                if (left < low && right > high){
                    return -1;
                }
                if(left>low && arr[left]!=""){
                    mid=left;
                    break;
                }
                else if(right<high && arr[right]!=""){
                    mid=right;
                    break;
                }
                left--;
                right++;
            }
        }
        System.out.println("new mid= "+mid);

        if(arr[mid].compareTo(x) == 0){
            return mid;
        }
        else if(arr[mid].compareTo(x) < 0){
            return sparseSearch(arr, mid+1, high, x);
        }
        else{
            return sparseSearch(arr, low, mid-1, x);
        }

    }

    public static void main(String[] args) {
        String arr[] = {"for", "geeks", "", "", "", "", "ide", "practice", "", "", "", "quiz"};
        String x = "geeks";
        int index = sparseSearch(arr, 0, arr.length-1, x);
        if (index != -1){
            System.out.println(x+ " found at index "+index);
        }
        else{
            System.out.println(x+ " not found");
        }
    }
}
