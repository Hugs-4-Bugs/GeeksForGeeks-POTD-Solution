class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
          Set<Long> set=new HashSet<>();
        for(int i:arr){
            long sq=(long)Math.pow(i,2);
            set.add(sq);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long sq1=(long)Math.pow(arr[i],2);
                long sq2=(long)Math.pow(arr[j],2);
                if(set.contains(sq1+sq2)) return true;
            }
        }
        
        return false;
    }
}
