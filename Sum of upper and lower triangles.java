class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
           int upper=0,lower=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j)
                    upper+=matrix[i][j];
                if(i>=j)
                    lower+=matrix[i][j];
            }    
        }
        arr.add(upper);
        arr.add(lower);
        return arr;
        
    }
}
