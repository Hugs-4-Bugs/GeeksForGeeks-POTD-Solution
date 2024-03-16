class Solution
{
   void deleteNode(Node del_node)
    {
         // Your code here
         
         // O(n) approach -- shift all to 1 left
        //  Node prev = null;
        //  Node ptr = del_node;
         
        //  while(ptr.next != null){
        //      ptr.data = ptr.next.data;
        //      prev = ptr;
        //      ptr = ptr.next;
        //  }
         
        //  prev.next = null;
         
         // O(1) approach -- copy next node value to current node and 
         // remove the next node itself
         Node ptr = del_node.next;
         
         del_node.data = ptr.data;
         
         del_node.next = ptr.next;
         
    }
    
}

