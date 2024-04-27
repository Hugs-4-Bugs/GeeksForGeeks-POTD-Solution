class Solution {
    // Function to sort the given doubly linked list using Merge Sort.
     static Node sortDoubly(Node head)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr1=head;
        while(curr1.next!=null)
        {
            arr.add(curr1.data);
            curr1=curr1.next;
        }
        arr.add(curr1.data);
        Collections.sort(arr);
        Node curr=head;
        for(int i=0;i<arr.size();i++){
            curr.data=arr.get(i);
            curr=curr.next;
        }
        return head;
    }
}
