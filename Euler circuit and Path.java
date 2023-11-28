class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if (adj[i].size() % 2 == 0) {
                cnt++;
            }
        }
        if (cnt == V) return 2;
        if (cnt == V - 2) return 1;
        return 0;
    }

    public static void main(String[] args) {
        int V = 5;
        List<Integer>[] adj = new List[V];
        for (int i = 0; i < V; ++i)
            adj[i] = new LinkedList<>();

        // Add edges
        adj[1].add(0);
        adj[0].add(2);
        adj[2].add(1);
        adj[0].add(3);
        adj[3].add(4);
        adj[4].add(0);

        Solution solution = new Solution();
        int result = solution.isEulerCircuit(V, adj);
        System.out.println("Result: " + result);
    }
}
