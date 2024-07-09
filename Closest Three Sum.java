class Solution {
    static int threeSumClosest(int[] array, int target) {
       
       Arrays.sort(array);
       int ans=0;
       int sum=0;
       
       for(int i=0; i<array.length-2; i++){
           int j=i+1;
           int k=array.length-1;
           while(j<k){
               int currentsum=array[i]+array[j]+array[k];
               int ref=Math.abs(target-currentsum);
               if(currentsum==target){
                   return target;
               }
               else if(ans==0 || ref<ans){
                   ans=ref;
                   sum=currentsum;
               }
               else if(ans==ref && currentsum>sum){
                   ans=ref;
                   sum=currentsum;
               }
               
               
               if(currentsum>target){
                   k--;
               }
               else if(currentsum<target){
                   j++;
               }
           }
           
       }
       
       return  sum;
    }
}
