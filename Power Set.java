class Solution{
    public void solve(int ind,String s,List<String> ans,StringBuilder sb){
        if(ind == s.length()){
            if(sb.length() == 0){
                return;
            }
            ans.add(sb.toString());
            return;
        }
        
        sb.append(s.charAt(ind));
        solve(ind+1,s,ans,sb);
        sb.deleteCharAt(sb.length()-1);
        solve(ind+1,s,ans,sb);
    }
    public List<String> AllPossibleStrings(String s){
        // Code here
        List<String> ans=new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        solve(0,s,ans,sb);
        Collections.sort(ans);
        return ans;
    }
}

