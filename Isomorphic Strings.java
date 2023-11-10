class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length())
            return false;
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if((hm.containsKey(str1.charAt(i)))){
                if(hm.get(str1.charAt(i))!=str2.charAt(i))
                    return false;
                    
            } else{
                if(hm.containsValue(str2.charAt(i)))
                    return false;
                hm.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
    }
}
