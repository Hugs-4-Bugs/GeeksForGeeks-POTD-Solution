class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        // If the linked list is empty or contains a single element, return null
        if (head == null || head.next == null)
            return null;
        
        // Initialize slow and fast pointers
        Node slow_ptr = head;
        Node fast_ptr = head;
        Node prev = null;
        
        // Move fast_ptr by two and slow_ptr by one
        while (fast_ptr != null && fast_ptr.next != null) {
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        
        // Delete the middle node
        prev.next = slow_ptr.next;
        
        return head;
    }
}
