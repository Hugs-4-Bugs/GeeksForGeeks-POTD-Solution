class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int ans=n/k;
        int count=0;
    HashMap<Integer,Integer>H=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        H.put(arr[i],H.getOrDefault(arr[i],0)+1);
    }

    for(var a: H.entrySet()){
        if(a.getValue()>ans){
            count++;
        }
    }
    return count;
    }
}
