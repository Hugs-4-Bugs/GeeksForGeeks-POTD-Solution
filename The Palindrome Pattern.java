  class Solution {
    public String pattern(int[][] arr) {
         int rows=arr.length;
         int cols=arr[0].length;
         int k=0;
         int mid=cols/2;
         for(int i=0;i<rows;i++){
             int start=0;
             int last=cols-1;
             boolean flag=false;
             while(start<=mid)
             {
             if(arr[k][start]!=arr[k][last])
             {
                 flag=false;
                break;
             }
                start++;
                last--;
                flag=true;
             }
             k++;
            if(flag==true)
                return i+" "+ "R";
         }
         int l=0;
          for(int i=0;i<arr.length;i++){
             int start=0;
             int last=cols-1;
             boolean flag=false;
             while(start<=mid)
             {
             if(arr[start][l]!=arr[last][l])
             {
                 flag=false;
                break;
             }
                start++;
                last--;
                flag=true;
             }
             l++;
            if(flag==true)
                return i+" "+ "C";
         }
         return "-1";
    }
}

