class Solution {
    public static int noOfStation(double dis , int[] arr)
    {
        int n = arr.length;
        int cnt =0;
        for(int i=1;i<n;i++)
        {
            int numdis = (int) ((arr[i]-arr[i-1])/dis);
            if(arr[i]-arr[i-1] == dis*numdis)
            {
                numdis--;
            }
            cnt+=numdis;
        }
        return cnt;
    }
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n = stations.length;
        double low =0;
        double high = 0;
        for(int i =1;i<n-1;i++)
        {
            high = Math.max(high,(double)(stations[i] - stations[i-1]));
        }
       double diff = 1e-6;
        while(high - low >diff)
        {
            double mid = (low+high)/2.0;
            int cnt = noOfStation(mid,stations);
            if(cnt>k)
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }
        return high;
    }
}
