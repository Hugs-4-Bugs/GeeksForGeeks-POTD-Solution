class Solution {
    Node delete(Node head, int k) {
        if (head == null || k <= 1) {
            return null; 
        }
        
        if (k == 2) {
 
            return deleteAlternate(head);
        }
        
        Node current = head;
        Node prev = null;
        int count = 0;
        
        while (current != null) {
            count++;
            if (count % k == 0) {
                
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        
        return head;
    }
    
   
    private Node deleteAlternate(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
        return head;
    }
}
