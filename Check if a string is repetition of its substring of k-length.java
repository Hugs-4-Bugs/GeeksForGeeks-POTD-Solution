class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
         if(n%k!=0)
        {
            return 0;
        }
        int i=0;
        HashSet<String>set=new HashSet<>();
        String res="";
        for(i=0;i<k;i++)
        {
            res+=s.charAt(i);
        }
        set.add(res);
        res="";
        i=k;
        while(i<n)
        {
            int j=0;
            while(j<k)
            {
                res+=s.charAt(i);
                i++;
                j++;
            }
            set.add(res);
            res="";
        }
        if(set.size()<=2)
        {
            return 1;
        }
        return 0;
        
        
    }
}
