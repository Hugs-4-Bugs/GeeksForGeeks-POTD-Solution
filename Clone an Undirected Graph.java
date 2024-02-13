class Solution{
    Node cloneGraph(Node node){
        
        Node start = node;
        HashSet<Node> visited = new HashSet<>();
        HashMap<Node,Node> map = new HashMap<>();
        dfs(start,visited,map);
        
        addEdges(map);
        
        return map.get(start);
    }
    public static void addEdges(HashMap<Node,Node> map){
        for(Map.Entry m : map.entrySet()){
            Node ori =(Node) m.getKey();
            map.get(m.getKey()).neighbors.add(ori);
        }
    }
    
    public static void dfs(Node start,HashSet<Node> visited,HashMap<Node,Node> map){
        
        visited.add(start);
        Node copyNode = new Node(start.val);
        map.put(start,copyNode);
        for(Node p : start.neighbors){
            if(!visited.contains(p)){
                dfs(p,visited,map);
            }
        }
        
    }
}
