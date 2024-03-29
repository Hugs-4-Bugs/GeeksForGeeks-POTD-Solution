class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
         Queue<Node> q = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            q.add(root);
            while(!q.isEmpty())
            {
                Node r = q.remove();
                list.add(r.data);
                if(r.left != null)
                {
                    q.add(r.left);
                }
                if(r.right != null)
                {
                    q.add(r.right);
                }
            }
            return list;
    }
}





