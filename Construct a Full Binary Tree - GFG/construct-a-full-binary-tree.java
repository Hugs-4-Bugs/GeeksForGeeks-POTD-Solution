//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    class gfg
    {
       
            int preIndex = 0;
        
    }
    
    public Node constructBTree(int pre[], int preM[], int size)
    {
        gfg r = new gfg();
        Node root = constructBTreeUtil(pre, preM, r, 0, size-1, size);
        
        return root;
    }
    
    public  Node constructBTreeUtil(int pre[], int preM[], gfg r, int l, int h, int size)
    {
        if (r.preIndex >= size || l > h)
		return null;
    	Node root = new Node(pre[r.preIndex]);
    	++(r.preIndex);
    	if (l == h)	return root;
    	int i;
    	for (i = l; i <= h; ++i)
    	if (pre[r.preIndex] == preM[i])
    	    break;
    	if (i <= h)
    	{
    		root.left = constructBTreeUtil (pre, preM, r, i, h, size);
    		root.right = constructBTreeUtil (pre, preM, r, l+1, i-1, size);
    	}
	    return root; 
    }
}