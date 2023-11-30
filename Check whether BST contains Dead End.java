class Solution
{
    // Method to check if there is a dead end in the binary tree
    public static boolean isDeadEnd(Node root)
    {
        // If the root is null, return false
        if(root==null)
        return false;
        
        // Check for a dead end starting from the root
        return find(root,0,Integer.MAX_VALUE);
    }
    
    // Method to recursively check for a dead end in the binary tree
    public static boolean find(Node root,int Min,int Max)
    {
        // If the current node is null, return false
        if(root==null)
        return false;
        
        // If the current node's data is exactly 1 less than Min and 1 greater than Max,
        // return true as it indicates a dead end
        if(root.data-Min==1 && Max-root.data==1)
        return true;
        
        // Recursively check for a dead end in the left and right subtrees
        if(find(root.left,Min,root.data)==true||find(root.right,root.data,Max)==true)
        return true;
        
        // If no dead end is found, return false
        return false;
    }
}
