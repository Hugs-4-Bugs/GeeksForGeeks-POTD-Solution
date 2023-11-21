class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
         if(root==null)
        {
            return true;
        }
        return helper(root.left,root.right);
    }
    public static boolean helper(Node left,Node right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }
        
        return (left.data==right.data) && helper(left.left,right.right)&&helper(left.right,right.left);
    }
}
