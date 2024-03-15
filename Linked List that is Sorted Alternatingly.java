class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        // base case
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            arr.add(curr.data);
            curr = curr.next;
        }
        Collections.sort(arr);
        curr = head;
        for(int i=0; i<arr.size(); i++){
          int value = arr.get(i);
            
            // OR for(Integer value: arr){ 
            curr.data = value;
            curr = curr.next;
        }
        return head;
   }


}
