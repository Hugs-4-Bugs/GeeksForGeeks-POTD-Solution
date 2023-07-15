//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // Calculate the index of the middle element
        int midIndex = sizeOfStack / 2;
    
        // Create a temporary stack to hold the elements
        Stack<Integer> tempStack = new Stack<>();
    
        // Push elements from the original stack to the temporary stack until reaching the middle index
        for (int i = 0; i < midIndex; i++) {
            tempStack.push(s.pop());
        }
    
        // Skip the middle element by popping it from the original stack
        s.pop();
    
        // Push back the elements from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
        
    } 
}

