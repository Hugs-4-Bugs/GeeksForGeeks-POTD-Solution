class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        String s="!#$%&*?@^";
        Set<Character> h=new HashSet<>();
        for(char c:nuts) h.add(c); 
        int j=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i); 
            if(i==n) break;
            if(h.contains(curr)){
                nuts[j]=curr;
                bolts[j]=curr; 
                j++;
            }
        }
    }
}
