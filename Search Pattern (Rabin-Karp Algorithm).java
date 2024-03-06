
class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> res = new ArrayList<>();
        int t = text.length();
        int p = pattern.length();
        
        for(int i = 0; i <= t-p; i++) {
         
            if(text.substring(i,i+p).equals(pattern))
                res.add(i+1);
        }
        
        return res;
    }
}
