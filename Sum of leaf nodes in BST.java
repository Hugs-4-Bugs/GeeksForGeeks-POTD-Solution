class Solution {
    static int sum;

    static void solve(Node root) {
        if(root == null)
            return;
            
        if(root.left == null && root.right == null) {
            sum += root.data;
            return;
        }
        
        solve(root.left);
        solve(root.right);
    }

    public static int sumOfLeafNodes(Node root) {
        sum = 0;
        solve(root);
        return sum;
    }
}
