class Solution {
   int minDist(int arr[], int n, int x, int y) {
        // code here
        int minDist = n;
        int index_X = -1 ;
        int index_Y = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                index_X = i ;
            }
            else if(arr[i] == y){
                index_Y = i ;
            }
            else{
                continue;
            }
            if(index_X !=-1 && index_Y !=-1){
                minDist = Math.min(minDist, Math.abs(index_X - index_Y));
            }
        }
        if(index_X == -1 || index_Y==-1) return -1;
        
        return minDist ;
    }
}
