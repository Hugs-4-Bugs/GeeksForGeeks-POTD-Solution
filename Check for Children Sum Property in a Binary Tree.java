class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        if(root==null)
        return 1;
        if(root.left==null && root.right==null)
        return 1;
        int x=isSumProperty(root.left);
        int y=isSumProperty(root.right);
        int z=0;
        int a=(root.left==null) ? 0:root.left.data;
        int b=(root.right==null) ? 0:root.right.data;
        if(root.data==a+b)
        z=1;
        return x & y & z;
        // add your code here
        
    }
}

