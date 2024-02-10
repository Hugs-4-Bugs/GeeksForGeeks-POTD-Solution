
class Solution{
    static int fn(int n,ArrayList<Integer> al)
    {
        int val=al.get(n-1)-n;
        if(val>0 && !al.contains(val))
        return val;
        return val+(2*n);
    }
    
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(0);
        int i=1;
        while(al.size()<=n)
        {
            int k=fn(i,al);
            al.add(k);
            i++;
        }
        return al;
    }
}
