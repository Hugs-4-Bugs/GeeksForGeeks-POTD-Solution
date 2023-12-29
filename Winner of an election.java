class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        int res=0;
        String[] winner=new String[2];
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
            int curr=h.get(arr[i]);
            if(curr>res){
                res=curr;
                winner[0]=arr[i];
                winner[1]=Integer.toString(curr);
            }
            else if(curr==res){
                if(arr[i].compareTo(winner[0])<0 ){
                    winner[0]=arr[i];
                }
            }
        }
        return winner;
    }
}
