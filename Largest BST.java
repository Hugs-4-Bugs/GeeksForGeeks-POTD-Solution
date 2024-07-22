class Solution{
    static class NodeVal{
        int minimum;
        int maximum;
        int maxSize;
        NodeVal(int minimum,int maximum,int maxSize){
            this.minimum=minimum;
            this.maximum=maximum;
            this.maxSize=maxSize;
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        NodeVal ans =largest(root);
        return ans.maxSize;
        
        
    }
    
    static NodeVal largest(Node root){
        if(root==null){
            return new NodeVal(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        
        NodeVal left=largest(root.left);
        NodeVal right=largest(root.right);
        
        if(left.maximum<root.data && root.data<right.minimum){
            return new NodeVal(
                Math.min(left.minimum,root.data),
                Math.max(right.maximum,root.data),
                1+left.maxSize+right.maxSize
                );
        }
        
        return new NodeVal(  Integer.MIN_VALUE,
                             Integer.MAX_VALUE,
                             Math.max(left.maxSize,right.maxSize)
                             );
    }
    
}
