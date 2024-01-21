class Solution {
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(root, sum, path, 0, result);
        return result;
    }

    private static void findPaths(Node node, int sum, ArrayList<Integer> path, int currentSum, ArrayList<ArrayList<Integer>> result) {
        if (node == null) {
            return;
        }

        // Add the current node to the path
        currentSum += node.data;
        path.add(node.data);

        // Check if the current path sum equals the target sum
        if (currentSum == sum) {
            result.add(new ArrayList<>(path));
        }

        // Continue to search down to the left and right children
        findPaths(node.left, sum, path, currentSum, result);
        findPaths(node.right, sum, path, currentSum, result);

        // Backtrack: Remove the current node from the path
        path.remove(path.size() - 1);
    }
}
