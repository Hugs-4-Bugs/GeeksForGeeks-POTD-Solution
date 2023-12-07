class Solution
{
    public int minNumber(int arr[], int N)
    {
         int sum=0;
        for(int i : arr){
            sum+=i;
        }
        int count=0;
        while(!isprime(sum)){
            sum=sum+1;
            count++;
        }
        return count;
    }
    boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
