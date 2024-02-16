class Solution {
    public Node flattenBST(Node root) {
        // Code here
        ArrayList<Integer> arrl = new ArrayList<>();
        inorder(root,arrl);
        Node res = new Node(arrl.get(0));
        Node ans = res;
        for(int i=1;i<arrl.size();i++){
            res.right=new Node(arrl.get(i));
            res=res.right;
        }
        return ans;
    }
    
    static void inorder(Node root,ArrayList<Integer> arrl){
        if(root==null)  return;
        if(root.left!=null) inorder(root.left,arrl);
        arrl.add(root.data);
        if(root.right!=null) inorder(root.right,arrl);
    }
}
