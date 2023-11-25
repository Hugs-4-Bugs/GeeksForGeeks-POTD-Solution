class Solution{
    public List<Integer> pattern(int N){
        // code here
        
    ArrayList<Integer> list = new ArrayList<>();
    if(N ==  0 || N < 0)
    {
        list.add(N);
        return list;
    }
    //return 0;
    list.add(N);
    pi(N,-5,list);
    return list;
    }
    public static void pi(int n ,int l, ArrayList<Integer> list )
    {
        n = n + l;
        list.add(n);
        if(n == list.get(0))
        return;
        
        if(n <=0)
        {
          
            l = -l;
        }
        pi(n,l,list);
    }
}

