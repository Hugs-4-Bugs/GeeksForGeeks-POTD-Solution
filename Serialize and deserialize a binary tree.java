class Tree {
    static int idx; // Static variable to keep track of index during deserialization
    
    // Preorder traversal to serialize the tree
    public static void preOrder(Node rt, ArrayList<Integer> al) {
        if (rt == null) {
            al.add(-1); // Add -1 to represent null node
            return;
        }
        al.add(rt.data); // Add node data
        preOrder(rt.left, al); // Recur for left subtree
        preOrder(rt.right, al); // Recur for right subtree
    }
    
    // Function to create the tree during deserialization
    public static Node create(ArrayList<Integer> al) {
        idx++; // Move to next index in the serialized array
        if (al.get(idx) == -1) { // If null node encountered
            return null;
        }
        Node newNode = new Node(al.get(idx)); // Create new node
        newNode.left = create(al); // Recur for left subtree
        newNode.right = create(al); // Recur for right subtree
        return newNode;
    }
    
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        preOrder(root, a); // Call preorder traversal to serialize the tree
        return a; // Return serialized array
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        idx = -1; // Reset index before deserialization
        Node root = create(A); // Call create function to construct tree from serialized array
        return root; // Return root of the deserialized tree
    }
}
