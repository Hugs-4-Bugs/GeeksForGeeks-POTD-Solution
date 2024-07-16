
class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        for(int i=0; i<s.length(); i++){
            if(count == 0) {
            return s.substring(i);
            }
                  if(s.charAt(i) == ch){
                      
                   count--;
                  }
        }
        return "";
    }
}
