class Solution {
    public List<Node> printAllDups(Node root) {
        // code here
        List<Node> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        serializeAndFind(root, map, result);
        return result;
    }

    private String serializeAndFind(Node node, Map<String, Integer> map, List<Node> result) {
        if (node == null) {
            return "#"; // A marker for null nodes
        }

        // Serialize the current subtree
        String serialized = node.data + "," + serializeAndFind(node.left, map, result) + "," + serializeAndFind(node.right, map, result);
        
        // Update the frequency map
        map.put(serialized, map.getOrDefault(serialized, 0) + 1);
        
        // If the frequency becomes 2, it means it's a duplicate subtree
        if (map.get(serialized) == 2) {
            result.add(node);
        }

        return serialized;
    }
}

