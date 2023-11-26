class DSU
{
    private int n;
    private int parent[];
    DSU(int n)
    {
        this.n = n;
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) 
        {
            parent[i] = -1; 
        }
    }
    
    int find(int x)
    {
        if(parent[x]<0)
        {
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    
    void union(int x,int y)
    {
        int px=find(x);
        int py=find(y);
        if(px!=py)
        {
            parent[px]=py;
        }
    }
}

class Solution
{
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        DSU d = new DSU(V+1);
        Map<Integer, Map<Integer, Integer>> mp = new HashMap<>();

        for (int u = 0; u < V; u++) 
        {
            for (int v : adj.get(u)) 
            {
                if (mp.containsKey(u) && mp.get(u).containsKey(v)) 
                {
                    continue;
                }
                
                if (mp.containsKey(v) && mp.get(v).containsKey(u)) 
                {
                    continue;
                }                
                
                if (!mp.containsKey(u)) 
                {
                    mp.put(u, new HashMap<>());
                }
                
                mp.get(u).put(v, 1);
                
                int x = d.find(u);
                int y = d.find(v);
                
                if (x == y) 
                {
                    return 1;
                }
                d.union(u, v);
            }
        }

        return 0;
    }
}
