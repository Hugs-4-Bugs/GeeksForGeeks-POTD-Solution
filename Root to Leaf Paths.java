class Solution {
    public static void solve(Node root ,ArrayList<ArrayList<Integer>> res ,  ArrayList<Integer> temp ){
        if(root == null){
            return;
        }
        temp.add(root.data);
        if(root.left == null && root.right == null){
            res.add(new ArrayList<>(temp));
// Aditya Konda
        }
        solve(root.left , res , temp);
        solve(root.right , res , temp);
        temp.remove(temp.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // Aditya Konda
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(root , res , temp);
        return res;
    }
}
