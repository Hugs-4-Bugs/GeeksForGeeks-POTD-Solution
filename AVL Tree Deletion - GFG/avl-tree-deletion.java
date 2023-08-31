//{ Driver Code Starts
import java.io.*;
import java.util.*;

class pair
{
    int first;
    boolean second;
    pair(int first, boolean second)
        {
            this.first = first;
            this.second = second;
        }
}
class Node
{
    int data, height;
    Node left, right;
    
    Node(int x)
    {
        data=x;
        left=right=null;
        height=1;
    }
}
public class GfG
{
    
    public static int setHeights(Node n)
    {
    	if(n==null) return 0;
    	n.height = 1 + Math.max( setHeights(n.left) , setHeights(n.right) );
    	return n.height;
    }
    
    static Node buildTree(String str)
    {
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        setHeights(root);
        return root;
    }
    
    public static boolean isBST(Node n, int lower, int upper)
    {
    	if(n==null) return true;
    	if( n.data <= lower || n.data >= upper ) return false;
    	return isBST(n.left, lower, n.data) && isBST(n.right, n.data, upper) ;
    }
    
    public static pair isBalanced(Node n)
    {
    	if(n==null)
    	    {
    	        return new pair(0,true);
    	    }
        
    	pair l = isBalanced(n.left);
    	pair r = isBalanced(n.right);
    
    	if( Math.abs(l.first - r.first) > 1 ) return new pair (0,false);
    
    	return new pair( 1 + Math.max(l.first , r.first) , l.second && r.second );
    }
    
    public static boolean isBalancedBST(Node root)
    {
    	if( isBST(root, Integer.MIN_VALUE , Integer.MAX_VALUE) == false )
    		System.out.print("BST voilated, inorder traversal : ");
    
    	else if ( isBalanced(root).second == false)
    		System.out.print("Unbalanced BST, inorder traversal : ");
    
    	else return true;
    	return false;
    }
    
    public static void printInorder(Node n)
    {
    	if(n==null) return;
    	printInorder(n.left);
    	System.out.print(n.data + " ");
    	printInorder(n.right);
    }


    public static void main(String args[]) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
            
            while(t-->0)
                {
                    String s = br.readLine();
    	    	    Node root = buildTree(s);
    	    	    
                    
                    int n = Integer.parseInt(br.readLine());
                    int ip[] = new int[n];
                    
                    String[] in = br.readLine().trim().split("\\s+");
                    
                    for(int i = 0; i < n; i++)
                        ip[i] = Integer.parseInt(in[i]);
                    
                    Sol obj = new Sol();
                    
                    for(int i=0; i<n; i++)
            		{
            			root = obj.deleteNode(root, ip[i]);
            			
            			if(isBalancedBST(root)==false)
            				break;
            		}
        
            		if(root==null)
            			System.out.print("null");
            		else
            			printInorder(root);
            		System.out.println();    
                    
                    
                 
                    
                }
            
                
        }
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
	int data, height;
	Node left, right;
	Node(int x)
	{
		data = x;
		height = 1;
		left = right = NULL;
	}
}
*/
class Sol {
   public static int height(Node N)
    {
        // if Node is null, return height as 0
        if (N == null)
            return 0;
        
        // return the height of the Node
        return N.height;
    }

    public static Node rightRotate(Node y)
    {
        // perform right rotation on the Node y
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        // update the heights of the Nodes
        y.height = Math.max(height(y.left), height(y.right))+1;
        x.height = Math.max(height(x.left), height(x.right))+1;
        return x;
    }
    
    public static Node leftRotate(Node x)
    {
        // perform left rotation on the Node x
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        // update the heights of the Nodes
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;
        return y;
    }
    
    public static int getBalance(Node N)
    {
        // get the balance factor of the Node N
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }
    
    public static Node minValueNode(Node node)
    {
        // find the minimum value Node in the subtree rooted at node
        Node current = node;
        while (current.left != null)
            current = current.left;
     
        return current;
    }
    public static Node deleteNode(Node root, int key)
    {
         if (root == null)
            return root;
 
        // if key is smaller than the root's key, recursively delete in left subtree
        if (key < root.data)
            root.left = deleteNode(root.left, key);
 
        // if key is greater than the root's key, recursively delete in right subtree
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
 
        
        else
        {
 
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null))
            {
                Node temp = null;
                
                // set temp to the non-null child
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
 
                // if temp is null, set root to null
                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else   
                    root = temp; 
            }
            else
            {
                // Node with two children
                // find the inorder successor (smallest in the right subtree)
                Node temp = minValueNode(root.right);
 
                // copy the value of the inorder successor to the root
                root.data = temp.data;
 
                // recursively delete the inorder successor
                root.right = deleteNode(root.right, temp.data);
            }
        }
 
        // if root is null, return null
        if (root == null)
            return root;
 
        // update the height of the root
        root.height = Math.max(height(root.left), height(root.right)) + 1;
 
        // get the balance factor of the root
        int balance = getBalance(root);
 
        // perform rotations based on the balance factor
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);
 
        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
 
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);
 
        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
 
        return root;
 
    }
}
