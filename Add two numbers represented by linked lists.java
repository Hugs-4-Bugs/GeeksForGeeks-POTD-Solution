class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        
        num1 = reverse(trimZero(num1));
        num2 = reverse(trimZero(num2));
        
        if(num1 == null && num2 == null)return new Node(0);
        
        Node head = new Node(-1);
        Node tail = head;
        int carry = 0;
        
        while(num1 != null || num2 != null || carry != 0){
            int x = num1 == null ? 0 : num1.data;
            int y = num2 == null ? 0 : num2.data;
            
            int d = x+y+carry;
            carry = d/10;
            tail.next = new Node(d%10);
            tail = tail.next;
            
            if(num1 != null)num1 = num1.next;
            if(num2 != null)num2 = num2.next;
        }
        
        return reverse(head.next);
    }
    
    static Node trimZero(Node head){
        Node cur = head;
        while(cur != null && cur.data == 0){
            cur = cur.next;
        }
        return cur;
    }
    
    static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
