class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
         ArrayList<Long> NthRow = new ArrayList<>();
        NthRow.add(1L);
        
        for (int i = 1; i < n; i++)
        {
            ArrayList<Long> temp = new ArrayList<>();
            temp.add(1L);
            
            for (int j = 0; j < NthRow.size() - 1; j++)
                temp.add((NthRow.get(j) + NthRow.get(j + 1)) % 1000000007);
                
            temp.add(1L);
            NthRow = temp;
        }
        
        return NthRow;
    }
}
