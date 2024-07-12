class Solution {
    boolean hasPathSum(Node root, int target) {
        return helper(root, 0, target);
    }
    
    private boolean helper(Node root, int sum, int target){
        if(root == null) return false;
        sum += root.data;
        if(root.left == root.right && sum == target) return true;
        return helper(root.left, sum, target) || helper(root.right, sum, target);
        
    }
}
