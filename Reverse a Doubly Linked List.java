public static Node reverseDLL(Node  head)
{
    //Your code here
        Node prev = null;
    Node curr = head;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
    return head;
    
}
