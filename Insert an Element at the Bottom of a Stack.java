class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        solve(st,x);
        return st;
    }
    public static void solve(Stack<Integer> st,int x){
        
        if(st.isEmpty()){
            st.push(x);
            return ;
        }
        int val = st.pop();
        solve(st,x);
        st.push(val);
    }
}
