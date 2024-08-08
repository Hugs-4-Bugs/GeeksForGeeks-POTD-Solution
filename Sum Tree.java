class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        int sum = 0;
        return Sum(root) != 0;
    }
    
    public int Sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return root.data;
        }
        
        int lsum = Sum(root.left);
        int rsum = Sum(root.right);
        if(root.data != lsum + rsum)
        {
            return 0;
        }
        
        return root.data + lsum + rsum;
    }
}
