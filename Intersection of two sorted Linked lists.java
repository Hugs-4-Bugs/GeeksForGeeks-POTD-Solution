class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node temp = new Node(0);
        Node p = temp;
        
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                p.next = head1;
                p = p.next;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
               head2 = head2.next; 
            }
        }
        p.next = null;
        return temp.next; // .next is to skip to very first element (i.e., 0)
    }
}
