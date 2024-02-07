class Solution
{
    boolean ans = true; 
    int helper(Node root){
        if(root==null)
            return 0;
       
       int left = helper(root.left);
       int right = helper(root.right);
       
       if(root.left!=null && root.right!=null && left!=right)
            ans = false;
       
       return Math.max(left,right)+1;
    }
    boolean check(Node root)
    {
    // Your code here
        helper(root);
        return ans;
    }
}


