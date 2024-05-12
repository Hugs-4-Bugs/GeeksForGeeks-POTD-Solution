class Solution {
    static int minSteps(int d) {
        // code here
        
        // Approach 1
        
        //   int ans = (int) Math.ceil(Math.sqrt(2 * d + 0.25) - 0.5), y = 0;
        // return ans + ((y = (ans + 2*(d%2)) % 4) == 0 ? 0 : 3 - y);
        
        
        
        
        
        
        
        
        // Approach 2
        
        int steps = 0;
        int  position = 0;
        while(position<d || (position - d) %2 !=0){
            steps++;
            position += steps;
            
        }
        return steps;
        
    }
}
