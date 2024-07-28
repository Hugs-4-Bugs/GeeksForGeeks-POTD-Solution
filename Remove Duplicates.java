class Solution {
    String removeDups(String str) {
        // code here
        HashSet<Character> hs= new HashSet<>();
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
                str1=str1+str.charAt(i);
            }
        }
        return str1;
    }
}
