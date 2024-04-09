class Solution {
    
    public int minPoints(int points[][], int m, int n){
        
        if(m==1 && n==1){
            return 1;
        }
         
        int prev[]=new int[n];
        prev[n-1]=points[m-1][n-1];
        for(int i=n-2;i>=0;i--){
            prev[i]=prev[i+1]+points[m-1][i];
            if(prev[i]>0){
                prev[i]=0;
            }
        }
        
        for(int i=m-2;i>=0;i--){
            
            int curr[]=new int[n];
            
            for(int j=n-1;j>=0;j--){
                
                int x=-1,y=-1;
                if(i+1<m && j+1<n){
                    if(prev[j]>curr[j+1]){
                        x=i+1;
                    }
                    else{
                        y=j+1;
                    }
                }
                else if(i+1<m){
                    curr[j]=prev[j];
                    x=i+1;
                }
                else if(j+1<n){
                    curr[j]=curr[j+1];
                    y=j+1;
                }
                
                if(x!=-1){
                    int test=prev[j]+points[i][j];
                    if(test>=0){
                        curr[j]=0;
                    }    
                    else{
                        curr[j]=test;
                    }
                }
                
                else if(y!=-1){
                    int test=curr[j+1]+points[i][j];
                    if(test>=0){
                        curr[j]=0;
                    }    
                    else{
                        curr[j]=test;
                    }
                }
                
            }
            
            prev=curr;
        }
        
        return Math.abs(prev[0])+1;
        
    }
}
