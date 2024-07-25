class Solution {
  
    Node solve(int []nums, int l, int r,Node ans){
        
        if(l>r){ //basecase when array has no elements
            return null;
        }
        if(l==r){ // basecase when array has single element
            return new Node(nums[l]);
        }
        int mid=(l+r)/2;//getting the middle element bacause that will be the root of the current subtree
        ans=new Node(nums[mid]);
        
        //breaking the arrays in two halfs    
        ans.left=solve(nums,l,mid-1,ans); // for left half
        ans.right=solve(nums,mid+1,r,ans); //for right half
            
        
        return ans;
    }
    
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        Node ans=null;
        ans=solve(nums,0,nums.length-1,ans);
        return ans;
    }
}
