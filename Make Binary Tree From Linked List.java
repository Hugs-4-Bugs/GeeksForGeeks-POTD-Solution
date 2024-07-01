class Solution {
  public static Tree convert(Node head, Tree node) {
        if(head==null)
            return node;
        Queue<Tree> parent=new LinkedList<>();
        node=new Tree(head.data);
        parent.add(node);
        while(head!=null){
            Tree t=parent.poll();
            head=head.next;
            if(head!=null){
                t.left=new Tree(head.data);
                parent.add(t.left);
                head=head.next;
                if(head!=null){
                    t.right=new Tree(head.data);
                    parent.add(t.right);
                }
            }
        }
        return node;
    }
}
