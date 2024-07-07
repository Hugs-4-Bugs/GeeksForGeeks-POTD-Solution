class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        recurse(root,temp,res,target);
        return res;

        
    }
    static void recurse(Node root,ArrayList<Integer> temp,ArrayList<Integer> res,int target){
        if (root==null) return;
        if (root.data==target){
            Collections.reverse(temp);
            res.addAll(temp);
            return;
        }
        temp.add(root.data);
        recurse(root.left,temp,res,target);
        
        recurse(root.right,temp,res,target);
        temp.remove(temp.size()-1);
        
    }
    
}
