class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
         if (root == null)
            return -1;
            
        if (root.key > n)
            return findMaxForN(root.left, n);
        
        int rightkey = findMaxForN(root.right, n);
        return root.key > rightkey ? root.key : rightkey;
        
    }
}
