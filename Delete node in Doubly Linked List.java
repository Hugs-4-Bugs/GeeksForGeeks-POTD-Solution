class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1){
            return head.next;
        }
        Node temp = head;
          
        while (x > 1) {
            x--;
            temp = temp.next;
        }
        
        temp.prev.next = temp.next;
        
        
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        
        return head;
    }
}
  
