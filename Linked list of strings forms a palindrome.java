class Solution {
    public boolean compute(Node root) {
          StringBuilder sb = new StringBuilder("");
        for(Node node=root; node!=null; node=node.next){
            sb.append(node.data);
        }
        int s=0, e=sb.length()-1;
        while(s<e) if(sb.charAt(s++) != sb.charAt(e--)) return false;
        return true;
    }
}
