class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head.next == null){   // step 1
            head.data+= 1;  // Add 1 to the last node
		    return head;
	    }
	    Node sum = addOne(head.next);   // step 2
	    head.data+= (sum.data/10);   // step 3
	    sum.data = sum.data%10;   // step 4
	    return head;   // step 5
    }
}
 

/*
Step 1 :  Base case: if current node is the last node 

Step 2 :  Recursive case: Recur for the next node and process the rest of the linked list

Step 3 :  Add the carry, if any, to the current node's data

Step 4 :  Update sum.data to be the unit digit of current node's value

Step 5 :  Return the current node, which now contains the updated data

*/
