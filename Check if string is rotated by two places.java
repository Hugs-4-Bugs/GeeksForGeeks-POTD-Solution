class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
       int a = str1.length(), b = str2.length();
       if(a != b) return false;
       if(a == 1) return true;
       String s = str2 + str2;
       int ans = s.indexOf(str1);
       return((ans==2) || (ans==a-2));
    }
    
}
