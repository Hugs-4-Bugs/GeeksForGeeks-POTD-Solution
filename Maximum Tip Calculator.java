class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        int a[][] = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = arr[i];
            a[i][1] = brr[i];
        }
        Arrays.sort(a,(o1,o2)-> Math.abs(o2[0]-o2[1]) - Math.abs(o1[0]-o1[1]));
        
        long ans=0;
        for(int i[]:a){
            if((i[0]>i[1] && x>0) || (y==0)){
                ans+=i[0];
                x--;
            }else{
                ans+=i[1];
                y--;
            }
        }
        
        return ans;
    }
}
