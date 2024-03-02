class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int elem : a){
           map.put(elem, map.getOrDefault(elem, 0) + 1);
           if(map.get(elem) == k){
               return elem;
           }
        }
        return -1;
    } 
}
