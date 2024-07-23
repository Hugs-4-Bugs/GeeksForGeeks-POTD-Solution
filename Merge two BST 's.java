class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
         List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        // Perform in-order traversal to get the sorted list of nodes from both BSTs
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        
        // Merge the two sorted lists
        return mergeSortedLists(list1, list2);
    }

    // Helper function to perform in-order traversal and add node values to a list
    private void inOrderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }

    // Helper function to merge two sorted lists
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        
        // Merge the two lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        
        // Add remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        
        // Add remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        
        return mergedList;
    }
}
    
