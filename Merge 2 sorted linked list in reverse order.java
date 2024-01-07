
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	   Node temp1 = node1;
    Node temp2 = node2;
    Node head = null;
    Node temp3 = head;
    
    while(temp1 != null&& temp2 != null)
    {
       // System.out.println("helo");
        if(temp1.data < temp2.data)
        {
            Node newNode = new Node(temp1.data);
            newNode.next = temp3;
            temp3 = newNode;
            head = temp3;
            temp1 = temp1.next;
        }
        else
        {
            Node newNode = new Node(temp2.data);
            newNode.next = temp3;
            temp3 = newNode;
            head = temp3;
            temp2 = temp2.next;
        }
    
        
    }
    
//agr first list me item bche hue h to 
 
    while(temp1!= null)
    {
            Node newNode = new Node(temp1.data);
            newNode.next = temp3;
            temp3 = newNode;
            head = temp3;
            temp1 = temp1.next;
    }
// agr second list me item bche hue h to
      while(temp2!= null)
    {
            Node newNode = new Node(temp2.data);
            newNode.next = temp3;
            temp3 = newNode;
            head = temp3;
            temp2 = temp2.next;
    }
    
    
    
    return head;
    
    }
}
