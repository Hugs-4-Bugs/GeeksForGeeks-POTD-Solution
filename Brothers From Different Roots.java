class Solution
{
    static void inorder(Node root,ArrayList<Integer>ans1){
        if(root==null)return;
        inorder(root.left,ans1);
        ans1.add(root.data);
        inorder(root.right,ans1);
    }
    
	public static int countPairs(Node root1, Node root2, int x)
	{
		ArrayList<Integer>ans = new ArrayList<>();
		ArrayList<Integer>ans2 = new ArrayList<>();
		inorder(root1,ans);
		inorder(root2,ans2);
		
		int i=0;
		int j=ans2.size()-1;
		int count=0;
		
		while(i<ans.size() && j>=0){
		    if(ans.get(i)+ans2.get(j)==x){
		        count++;
		          i++;
		          j--;
		    }
		    else if(ans.get(i)+ans2.get(j)<x){
		        i++;
		    }
		    else{
		        j--;
		    }
		}
		return count;
	}
}
