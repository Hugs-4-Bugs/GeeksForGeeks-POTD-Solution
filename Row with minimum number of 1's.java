class Solution {
    int minRow(int n, int m, int a[][]) {
        int min_ind=-1;
        int min_num=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1) cnt++;
            }
            if(cnt<min_num){
                min_num=cnt;
                min_ind=i;
            }
        }
        return min_ind+1;
    }
};
