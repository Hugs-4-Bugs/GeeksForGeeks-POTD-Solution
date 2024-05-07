class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
            Queue<Node> st = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.add(node);
        while(!st.isEmpty())
        {
            int s = st.size();
            for(int i = 0;i <s ;i++)
            {
                Node cur = st.remove();
                list.add(cur.data);
                if(cur.right != null)
                {
                    st.add(cur.right);
                }
                if(cur.left != null)
                {
                    st.add(cur.left);
                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}  
