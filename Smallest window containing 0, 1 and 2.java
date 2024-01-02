
class Solution {
    public int smallestSubstring(String S) {
        // Code here
          int z=-1,o=-1,t=-1,ans=Integer.MAX_VALUE;
        for (int i = 0; i < S.length(); i++) {
            char ch=S.charAt(i);
            if(ch=='0'){
                z=i;
            }else if(ch=='1'){
                o=i;
            }else {
                t=i;
            }

            if(z!=-1 && o!=-1 && t!=-1){
                int min=Math.min(Math.min(z, o), t);
                int max=Math.max(Math.max(z, o), t);
                ans=Math.min(ans, max-min+1);
            }
        }
        return ans==Integer.MAX_VALUE? -1 : ans;

    }
};
