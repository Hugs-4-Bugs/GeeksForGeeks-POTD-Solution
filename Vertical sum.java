class Pair{
    Node node;
    int level;
    Pair(Node a,int b){
        node=a;
        level=b;
    }
}
class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        Queue<Pair> q= new ArrayDeque<>();
        HashMap<Integer,Integer>  h = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        q.add(new Pair(root,0));
        int maxlevel=0,minlevel=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Pair curr=q.poll();
                if(h.containsKey(curr.level)){
                    h.put(curr.level,h.get(curr.level)+curr.node.data);
                } 
                else 
                  h.put(curr.level,curr.node.data);
                if(curr.node.left!=null) q.add(new Pair(curr.node.left,curr.level+1));
                if(curr.node.right!=null) q.add(new Pair(curr.node.right,curr.level-1));
                maxlevel= Math.max(maxlevel,curr.level);
                minlevel= Math.min(minlevel,curr.level);
            }
        }
        for(int i=maxlevel;i!=(minlevel-1);i--){
            if(h.containsKey(i))
              ans.add(h.get(i));
        }
        return ans;
    }
}

