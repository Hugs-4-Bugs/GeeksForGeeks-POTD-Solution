class Solution
{
    ArrayList<Integer> a=new ArrayList<Integer>();
    int absolute_diff(Node root)
    {
        
        int min=Integer.MAX_VALUE;
        inorder(a,root);
        for(int i=0;i<a.size()-1;i++){
            min=Math.min(Math.abs(a.get(i)-a.get(i+1)),min);
            
        }
        return min;
    }
    void inorder(ArrayList<Integer> a,Node root){
        if(root==null)
            return;
        inorder(a,root.left);
        a.add(root.data);
        inorder(a,root.right);
    }
}
