class GfG {
    int postIndex;
    Node buildTree(int in[], int post[], int n) {
        postIndex = n - 1;
        return buildTreeUtil(in, post, 0, n - 1);
    }
    
    Node buildTreeUtil(int in[], int post[], int inStart, int inEnd) {
        if (inStart > inEnd)
            return null;
        Node node = new Node(post[postIndex]);
        postIndex--;
        
        if (inStart == inEnd)
            return node;
        
        int inIndex = search(in, inStart, inEnd, node.data);
        
        node.right = buildTreeUtil(in, post, inIndex + 1, inEnd);
        node.left = buildTreeUtil(in, post, inStart, inIndex - 1);
        
        return node; 
    }
    
    int search(int arr[], int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}
