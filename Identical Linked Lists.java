public boolean areIdentical(Node head1, Node head2) {
        // Just iterate the list and check if current element is equal
        // in both lists. If yes, then continue else return false.
        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        
        // Both list pointers should exhaust after iteration
        if(head1 == null && head2 == null)
            return true;
            
        // if either of the head pointer is not null, meaning there are 
        // still elements in one of the list, return false.
        return false;
    }
