class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        HashSet<String>set=new HashSet<>();
         ArrayList<Integer> li=new  ArrayList<Integer> ();
        for(int i=0;i<matrix.length;i++){
            String s=Arrays.toString(matrix[i]);
            if(!set.add(s)){
                li.add(i);
            }
        }
        return li;
    }
}
