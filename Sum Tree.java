/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
        // Your code here
    //     int sum = 0;
    //     return Sum(root) != 0;
    // }
    
    // public int Sum(Node root)
    // {
    //     if(root == null)
    //     {
    //         return 0;
    //     }
    //     if(root.left == null && root.right == null)
    //     {
    //         return root.data;
    //     }
        
    //     int lsum = Sum(root.left);
    //     int rsum = Sum(root.right);
    //     if(root.data != lsum + rsum)
    //     {
    //         return 0;
    //     }
        
    //     return root.data + lsum + rsum;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Approach: Using ArrayList
    
    
    //     // List to store subtree sums
    //     ArrayList<Integer> sumList = new ArrayList<>();
        
    //     // Get the sum of the whole tree and populate sumList
    //     int totalSum = getSubtreeSums(root, sumList);
        
    //     // Return true if the root node satisfies the sum tree property
    //     // i.e., the sum of the entire tree should equal twice the root's value (for non-leaf nodes)
    //     return sumList.isEmpty() || root.data == totalSum - root.data;
    // }

    // // Helper method to calculate the sum of the subtrees and populate the list
    // int getSubtreeSums(Node node, ArrayList<Integer> sumList) {
    //     // Base case: an empty node has sum 0
    //     if (node == null) {
    //         return 0;
    //     }

    //     // Leaf nodes are considered to be Sum Trees
    //     if (node.left == null && node.right == null) {
    //         return node.data;
    //     }

    //     // Recursively calculate the sums of the left and right subtrees
    //     int leftSum = getSubtreeSums(node.left, sumList);
    //     int rightSum = getSubtreeSums(node.right, sumList);

    //     // Add the sum of the current node's left and right subtrees to the list
    //     sumList.add(leftSum + rightSum);

    //     // Return the total sum for the current subtree
    //     return node.data + leftSum + rightSum;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //  Level-Order Traversal with ArrayList:

    
    //  if (root == null) return true;
        
    //     // Level order traversal using a queue
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
        
    //     while (!queue.isEmpty()) {
    //         Node current = queue.poll();
            
    //         // Skip leaf nodes as they are considered Sum Trees
    //         if (current.left == null && current.right == null) continue;
            
    //         // Calculate the sum of left and right subtrees
    //         int leftSum = current.left != null ? subtreeSum(current.left) : 0;
    //         int rightSum = current.right != null ? subtreeSum(current.right) : 0;
            
    //         // If current node does not satisfy the Sum Tree property, return false
    //         if (current.data != leftSum + rightSum) return false;
            
    //         // Add children to the queue
    //         if (current.left != null) queue.add(current.left);
    //         if (current.right != null) queue.add(current.right);
    //     }
        
    //     return true;
    // }
    
    // // Helper function to calculate the sum of a subtree
    // int subtreeSum(Node node) {
    //     if (node == null) return 0;
    //     return node.data + subtreeSum(node.left) + subtreeSum(node.right);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //  Post-order Traversal with Sum Calculation:

    if (root == null) return true;
        
        // Call the recursive helper function
        return isSumTreeUtil(root) != -1;
    }

    int isSumTreeUtil(Node node) {
        // Base case: An empty tree is a Sum Tree and its sum is 0
        if (node == null) return 0;
        
        // Base case: A leaf node is a Sum Tree
        if (node.left == null && node.right == null) return node.data;
        
        // Recursively calculate the sum of left and right subtrees
        int leftSum = isSumTreeUtil(node.left);
        int rightSum = isSumTreeUtil(node.right);
        
        // If any subtree is not a Sum Tree, propagate the failure (-1)
        if (leftSum == -1 || rightSum == -1) return -1;
        
        // Check if the current node satisfies the Sum Tree property
        if (node.data == leftSum + rightSum) {
            // Return the sum of the current subtree
            return node.data + leftSum + rightSum;
        } else {
            // If not a Sum Tree, return -1
            return -1;
        }
    }
}
