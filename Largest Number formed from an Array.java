class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        
        
        /* Approach 1:
1. Sort the array of strings in descending order based on the concatenation of two strings 
    (b+a compared to a+b), ensuring the largest combination comes first.
2. Concatenate all sorted strings to form the largest possible number.
*/
        
        //   return Arrays.stream(arr).sorted((a, b) -> (b + a).compareTo(a + b)).reduce("", (x, y) -> x + y);
   
   
   
  
  
//   Approach 2

             Comparator<String> custom = (String a, String b) -> {
            return (b + a).compareTo(a + b);
        };
        String ans = "";
        Arrays.sort(arr, custom);
        for(String s: arr){
            ans += s;
        }
        
        return ans;
  
  
    }
}
