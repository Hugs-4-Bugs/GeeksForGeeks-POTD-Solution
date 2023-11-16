class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
   Queue<Node>q = new LinkedList<>();
    void traverse(Node root)
    {
        if(root==null)
        {
            return;
        }
        traverse(root.left);
        q.add(root);
        traverse(root.right);
    }
    Node bTreeToClist(Node root)
    {
        //your code here
        traverse(root);
        Node node = q.poll();
        root = node;
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            node.right = temp;
            temp.left = node;
            node = temp;
            if(q.isEmpty())
            {
              temp.right=root;  
              root.left = temp;
            }
        }
        
        return root;
    }
    
}
    
