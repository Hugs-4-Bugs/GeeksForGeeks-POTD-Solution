class Solution 
{ 
    static long countStr(long n)
	{
	    // code here
	     if(n<=1){
        return 3;
    }
    else if(n==2){
        return 8;
    }
    return (long) ((Math.pow(n,3) + 3*n + 2) / 2);
	}
} 
