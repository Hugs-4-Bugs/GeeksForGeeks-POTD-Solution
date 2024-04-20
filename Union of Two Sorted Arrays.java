class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
         TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr1)set.add(i);
        for(int i : arr2)set.add(i);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : set)ans.add(i);
        return ans;
    }
}



