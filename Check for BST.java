class Solution {
    List<Integer> inOrderList = new ArrayList<>();
    
    void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            inOrderList.add(root.data);
            inOrder(root.right);
        }
    }
    
    boolean isBST(Node root) {
        inOrder(root);
        
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= inOrderList.get(i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}
