class Solution
{
   public static Node insertionSort(Node head_ref)
    {
        //code here
        if(head_ref==null) return null;
        
        Node res=new Node(0);
        Node curr=head_ref;
        while(curr != null)
        {
            Node prev = res;
            while(prev.next!=null && prev.next.data <= curr.data)
            {
                prev=prev.next;
            }
            Node next = curr.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
        }
        return res.next;
    }
}
