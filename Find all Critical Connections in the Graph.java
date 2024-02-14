class Solution
{
    public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        return getBridges(adj, v);
    }
    
    public ArrayList<ArrayList<Integer>> getBridges(ArrayList<ArrayList<Integer>>adj, int v){
        int[]dt = new int[v];
        int[]low = new int[v];
        boolean[]vis = new boolean[v];
        
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        
        dfs(adj, vis, dt, low, 0, -1,ans);
    
        Collections.sort(ans, (a,b)->{
            if(a.get(0).equals(b.get(0))){
                return a.get(1)-b.get(1);
            }else{
                return a.get(0)-b.get(0);
            }
        });
        
        return ans;
    }
    int time = 0;
    public void dfs(ArrayList<ArrayList<Integer>>adj, boolean[]vis, int[]dt, int[]low, int curr, int parent, ArrayList<ArrayList<Integer>>ans){
        vis[curr] = true;
        
        dt[curr] = low[curr] = ++time;
        
        for(int node : adj.get(curr)){
            if(node == parent)continue;
            
            if(!vis[node]){
                dfs(adj, vis, dt,low, node, curr, ans);
                low[curr] = Math.min(low[curr], low[node]);
                
                // bridge condition
                if(low[node]>dt[curr]){
                    ArrayList<Integer>bridge = new ArrayList<>();
                    bridge.add(curr);
                    bridge.add(node);
                    Collections.sort(bridge);
                    ans.add(bridge);
                }
            }else{
                low[curr] = Math.min(low[curr], dt[node]);
            }
        }
    }
}
